package com.kestrelcjx.system.shiro;

import com.kestrelcjx.common.exception.user.CaptchaException;
import com.kestrelcjx.common.exception.user.UserNotExistsException;
import com.kestrelcjx.common.utils.StringUtils;
import com.kestrelcjx.system.entity.Admin;
import com.kestrelcjx.system.entity.Menu;
import com.kestrelcjx.system.entity.Role;
import com.kestrelcjx.system.service.ILoginService;
import com.kestrelcjx.system.service.IMenuService;
import com.kestrelcjx.system.service.IRoleService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm {
    private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);
    @Autowired
    private ILoginService loginService;
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IMenuService menuService;

    /**
     * 授权权限
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.warn("开始执行授权操作.......");
        Admin admin = (Admin) principalCollection.getPrimaryPrincipal();
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 权限设置
        if (admin.getId().equals(1)) {
            // 超级管理员
            simpleAuthorizationInfo.addStringPermission("*:*:*");
        } else {
            // 普通管理员及其他

            // 设置角色权限
            List<Role> roleList = roleService.getRoleListByAdminId(admin.getId());
            Set<String> roles = new HashSet<>();
            roleList.forEach(item -> {
                roles.add(item.getId().toString());
            });
            simpleAuthorizationInfo.addRoles(roles);

            // 设置菜单权限
            List<Menu> menuList = menuService.getMenuListByAdminId(admin.getId());
            Set<String> permissions = new HashSet<>();
            for (Menu menu : menuList) {
                if (StringUtils.isEmpty(menu.getPermission())) {
                    continue;
                }
                permissions.add(menu.getPermission());
                System.out.println("菜单权限：" + menu.getPermission());
            }
            simpleAuthorizationInfo.addStringPermissions(permissions);
        }
        return simpleAuthorizationInfo;
    }

    /**
     * 认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 获取用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = "";
        if (token.getPassword() != null) {
            password = new String(token.getPassword());
        }
        Admin admin = null;
        try {
            admin = loginService.login(username, password);
        } catch (CaptchaException e) {
            throw new AuthenticationException(e.getMessage(), e);
        } catch (UserNotExistsException e) {
            throw new UnknownAccountException(e.getMessage(), e);
        } catch (IncorrectCredentialsException e) {
            throw new IncorrectCredentialsException(e.getMessage(), e);
        } catch (LockedAccountException e) {
            throw new LockedAccountException(e.getMessage(), e);
        } catch (ExcessiveAttemptsException e) {
            throw new ExcessiveAttemptsException(e.getMessage(), e);
        } catch (Exception e) {
            logger.info("对用户[" + username + "]进行登录验证..验证未通过{}", e.getMessage());
            throw new AuthenticationException(e.getMessage(), e);
        }
        //进行验证
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                admin,                                  //用户名
                admin.getPassword(),                    //密码
                ByteSource.Util.bytes(""),      //设置盐值
                getName()
        );
        return authenticationInfo;
    }
}

