package com.kestrelcjx.common.utils;

import org.apache.commons.lang3.Validate;
import org.apache.poi.ss.usermodel.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.*;
import java.util.Date;

/**
 * 反射工具类
 * 提供调用getter/setter方法，访问私有变量，调用私有方法，获取泛型类型Class，被AOP过的真实类等工具函数
 */
public class ReflectUtils {
    private static final String SETTER_PREFIX = "set";
    private static final String GETTER_PREFIX = "get";
    private static final String CGLIB_CLASS_SEPARATOR = "$$";
    private static final Logger logger = LoggerFactory.getLogger(ReflectUtils.class);

    /**
     * 调用Getter方法
     * 支持多级，如：对象名.对象名.方法
     */
    @SuppressWarnings("unchecked")
    public static <E> E invokeGetter(Object obj, String propertyName) {
        Object object = obj;
        for (String name : StringUtils.split(propertyName, ".")) {
            String getterMethodName = GETTER_PREFIX + StringUtils.capitalize(name);
            object = invokeMethod(object, getterMethodName, new Class[]{}, new Object() {
            });
        }
        return (E) object;
    }

    /**
     * 调用Setter方法，仅匹配方法名
     * 支持多级，如：对象名.对象名.方法
     */
    public static <E> void invokeSetter(Object obj, String propertyName, E value) {
        Object object = obj;
        String[] names = StringUtils.split(propertyName, ".");
        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) {
                String getterMethodName = GETTER_PREFIX + StringUtils.capitalize(names[i]);
                object = invokeMethod(object, getterMethodName, new Class[]{}, new Object[]{});
            } else {
                String setterMethodName = SETTER_PREFIX + StringUtils.capitalize(names[i]);
                invokeMethodByName(object, setterMethodName, new Object[]{value});
            }
        }
    }

    /**
     * 直接读取对象属性值，无视private/protected修饰符，不经过getter函数
     */
    @SuppressWarnings("unchecked")
    public static <E> E getFieldValue(final Object object, final String fieldName) {
        Field field = getAccessibleField(object, fieldName);
        if (null == field) {
            logger.debug("在 [" + object.getClass() + "] 中，没有找到 [" + fieldName + "] 字段");
            return null;
        }
        E result = null;
        try {
            result = (E) field.get(object);
        } catch (IllegalAccessException e) {
            logger.error("不可能抛出的异常{}", e.getMessage());
        }
        return result;
    }

    /**
     * 循环向上转型，获取对象的DeclaredField，并强制设置为可访问<br>
     * 如向上转型到Object仍无法找到，返回null
     */
    private static Field getAccessibleField(Object object, String fieldName) {
        if (null == object) {
            return null;
        }
        Validate.notBlank(fieldName, "fieldName can't be blank");
        for (Class<?> superClass = object.getClass(); superClass != Object.class;
             superClass = superClass.getSuperclass()) {
            try {
                Field field = superClass.getDeclaredField(fieldName);
                makeAccessible(field);
                return field;
            } catch (NoSuchFieldException ignored) {
            }
        }
        return null;
    }

    /**
     * 直接调用对象方法，无视private/protected修饰符<br>
     * 用于一次性调用的情况，否则应该使用getAccessibleMethodByName()函数获得Method后反复调用<br>
     * 只匹配函数名，如果有多个同名函数调用第一个<br>
     */
    @SuppressWarnings("unchecked")
    private static <E> E invokeMethodByName(Object object, String methodName, Object[] args) {
        Method method = getAccessibleMethodByName(object, methodName, args.length);
        if (null == method) {
            logger.debug("在 [" + object.getClass() + "] 中，没有找到" + methodName + "] 方法");
            return null;
        }
        try {
            Class<?>[] cs = method.getParameterTypes();
            for (int i = 0; i < cs.length; i++) {
                if (args[i] != null && !args[i].getClass().equals(cs[i])) {
                    if (cs[i] == String.class) {
                        args[i] = ConvertUtils.toStr((String) args[i]);
                        if (StringUtils.endsWith((String) args[i], ".0")) {
                            args[i] = StringUtils.substringBefore((String) args[i], ".0");
                        }
                    } else if (cs[i] == Integer.class) {
                        args[i] = ConvertUtils.toInt(args[i]);
                    } else if (cs[i] == Long.class) {
                        args[i] = ConvertUtils.toLong(args[i]);
                    } else if (cs[i] == Double.class) {
                        args[i] = ConvertUtils.toDouble(args[i]);
                    } else if (cs[i] == Float.class) {
                        args[i] = ConvertUtils.toFloat(args[i]);
                    } else if (cs[i] == Date.class) {
                        if (args[i] instanceof String) {
                            args[i] = DateUtils.parseDate(args[i]);
                        } else {
                            args[i] = DateUtil.getJavaDate((Double) args[i]);
                        }
                    }
                }
            }
            return (E) method.invoke(object, args);
        } catch (Exception e) {
            String msg = "method: " + method + ", object: " + object + ", args: " + args;
            throw convertReflectExceptionToUnchecked(msg, e);
        }
    }

    /**
     * 循环向上转型，获取对象的DeclaredMethod，并强制设置为可访问<br>
     * 如向上转型到Object仍无法找到，返回null<br>
     * 只匹配函数名<br>
     * 用于方法需要被多次调用的情况，先使用本函数先取得Method，然后调用Method.invoke(Object obj, Object... args)<br>
     */
    private static Method getAccessibleMethodByName(final Object object, final String methodName,
                                                    final int argsNum) {
        if (null == object) {
            return null;
        }
        Validate.notBlank(methodName, "methodName can't be blank");
        for (Class<?> searchType = object.getClass(); searchType != Object.class;
             searchType = searchType.getSuperclass()) {
            Method[] methods = searchType.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().equals(methodName) && method.getParameterTypes().length == argsNum) {
                    makeAccessible(method);
                    return method;
                }
            }
        }
        return null;
    }

    /**
     * 直接调用对象方法，无视private/protected修饰符<br>
     * 用于一次性调用的情况，否则应使用getAccessibleMethod()函数获得Method后反复调用<br>
     * 同时匹配方法名+参数类型<br>
     */
    @SuppressWarnings("unchecked")
    public static <E> E invokeMethod(final Object object, final String methodName,
                                     final Class<?>[] parameterTypes, Object args) {
        if (null == object || null == methodName) {
            return null;
        }
        Method method = getAccessibleMethod(object, methodName, parameterTypes);
        if (null == method) {
            logger.debug("在 [+" + object.getClass() + "] 中，没有找到" + methodName + "] 方法");
            return null;
        }
        try {
            return (E) method.invoke(object, args);
        } catch (Exception e) {
            String msg = "method: " + method + ", obj: " + object + ", args: " + args;
            throw convertReflectExceptionToUnchecked(msg, e);
        }
    }

    /**
     * 将反射时的checked exception转换为unchecked exception
     *
     * @param msg
     * @param e
     * @return
     */
    private static RuntimeException convertReflectExceptionToUnchecked(String msg, Exception e) {
        if (e instanceof IllegalAccessException || e instanceof IllegalArgumentException
                || e instanceof NoSuchMethodException) {
            return new IllegalArgumentException(msg, e);
        } else if (e instanceof InvocationTargetException) {
            return new RuntimeException(msg, ((InvocationTargetException) e).getTargetException());
        }
        return new RuntimeException(msg, e);
    }

    /**
     * 循环向上转型，获取对象的DeclaredMethod，并强制设置为可访问<br>
     * 如向上转型到Object仍无法找到，返回null<br>
     * 匹配函数名+参数类型<br>
     * 用于方法需要被多次调用的情况，先使用本函数先取得Method，然后调用Method.invoke(Object obj, Object.. args)<br>
     */
    private static Method getAccessibleMethod(Object object, String methodName, Class<?>[] parameterTypes) {
        if (null == object) {
            return null;
        }
        Validate.notBlank(methodName, "methodName can't be blank");
        for (Class<?> searchType = object.getClass(); searchType != Object.class;
             searchType = searchType.getSuperclass()) {
            Method method = null;
            try {
                method = searchType.getDeclaredMethod(methodName, parameterTypes);
                makeAccessible(method);
                return method;
            } catch (NoSuchMethodException ignored) {
            }
        }
        return null;
    }

    /**
     * 改变private/protected的方法为public，尽量不调用实际改动的语句，避免JDK的SecurityManager抱怨
     */
    private static void makeAccessible(Method method) {
        if ((!Modifier.isPublic(method.getModifiers())
                || !Modifier.isPublic(method.getDeclaringClass().getModifiers()))
                && !method.isAccessible()) {
            method.setAccessible(true);
        }
    }

    /**
     * 改变privte/protected的成员变量为public，尽量不调用实际改动的语句，避免JDK的SecurityManager抱怨
     */
    public static void makeAccessible(Field field) {
        if ((!Modifier.isPublic(field.getModifiers())
                || !Modifier.isPublic(field.getDeclaringClass().getModifiers())
                || Modifier.isFinal(field.getModifiers())) && !field.isAccessible()) {
            field.setAccessible(true);
        }
    }

    /**
     * 通过反射，获得Class定义中声明的泛型参数的类型，注意泛型必须定义在父类处<br>
     * 如无法找到，返回Object.class
     *
     * @param clazz
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> Class<T> getClassGenericType(final Class clazz) {
        return getClassGenericType(clazz, 0);
    }

    /**
     * 通过反射，获得Class定义中声明的父类的泛型参数的类型
     * 如无法找到，返回Object.class
     */
    public static Class getClassGenericType(final Class clazz, final int index) {
        Type genType = clazz.getGenericSuperclass();
        if (!(genType instanceof ParameterizedType)) {
            logger.debug(clazz.getSimpleName() + "'s superclass not parameterizedType");
            return Object.class;
        }
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        if (index >= params.length || index < 0) {
            logger.debug("Index: " + index + ", Size of "
                    + clazz.getSimpleName() + "'s Parameterized Type: " + params.length);
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            logger.debug(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
            return Object.class;
        }
        return (Class) params[index];
    }

    public static Class getUserClass(Object instance) {
        if (null == instance) {
            throw new RuntimeException("Instance must not be null");
        }
        Class clazz = instance.getClass();
        if (clazz != null && clazz.getName().contains(CGLIB_CLASS_SEPARATOR)) {
            Class<?> superClass = clazz.getSuperclass();
            if (superClass != null && !Object.class.equals(superClass)) {
                return superClass;
            }
        }
        return clazz;
    }
}
