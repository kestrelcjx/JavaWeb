package com.kestrelcjx.system.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.kestrelcjx.system.filter.ShiroLoginFilter;
import com.kestrelcjx.system.filter.ShiroLogoutFilter;
import com.kestrelcjx.system.shiro.CustomCredentialsMatcher;
import com.kestrelcjx.system.shiro.MySessionManager;
import com.kestrelcjx.system.shiro.MyShiroRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;

/**
 * Shiro配置类
 */
@Configuration
public class ShiroConfig {
    private final String CACHE_KEY = "shiro:cache:";
    private final String SESSION_KEY = "shiro:session:";
    private Integer EXPIRE = 86400 * 7;
    @Value("{spring.redis.host}")
    private String host;
    @Value("{spring.redis.port}")
    private Integer port;
    @Value("{spring.redis.password}")
    private String password;
    @Value("{spring.redis.timeout}")
    private Integer timeout;
    // 设置Cookie的域名
    @Value("{shiro.cookie.domain}")
    private String domain;
    // 设置cookie的有效访问路径
    @Value("{shiro.cookie.path}")
    private String path;
    // 设置HttpOnly属性
    @Value("{shiro.cookie.httpOnly}")
    private boolean httpOnly;
    // 设置Cookie的过期时间，秒为单位
    @Value("{shiro.cookie.maxAge}")
    private int maxAge;
    // 登录地址
    @Value("{shiro.user.loginUrl}")
    private String loginUrl;
    // 权限认证失败地址
    @Value("{shiro.user.unauthorizedUrl}")
    private String unauthorizedUrl;
    // 后台主页地址
    @Value("{shiro.user.indexUrl}")
    private String indexUrl;

    public ShiroConfig() {
    }

    @Bean
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 必须设置 SecurityManager,Shiro的核心安全接口
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 身份认证失败，则跳转到登录页面的配置
        shiroFilterFactoryBean.setLoginUrl(loginUrl);
        //这里的/index是后台的接口名,非页面,登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl(indexUrl);
        // 未授权页面，权限认证失败，则跳转到指定页面
        shiroFilterFactoryBean.setUnauthorizedUrl(unauthorizedUrl);

        // 自定义过滤器
        LinkedHashMap<String, Filter> filtersMap = new LinkedHashMap<>();
        filtersMap.put("loginFilter", new ShiroLoginFilter());
        //配置自定义登出 覆盖 logout 之前默认的LogoutFilter
        filtersMap.put("logoutFilter", shiroLogoutFilter());
        shiroFilterFactoryBean.setFilters(filtersMap);

        // 配置访问权限 必须是LinkedHashMap，因为它必须保证有序
        // 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 --> : 这是一个坑，一不小心代码就不好使了
        /*
         * anon:所有url都都可以匿名访问，authc:所有url都必须认证通过才可以访问;
         * 过滤链定义，从上向下顺序执行，authc 应放在 anon 下面
         */
        // 过滤器链定义映射，Shiro连接约束配置，即过滤链的定义
        // 拦截配置
        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        filterChainDefinitionMap.put("/login", "anon");
        //logout是shiro提供的过滤器,这是走自定义的 shiroLogoutFilter 上面有配置
        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/captcha", "anon");

        // 不需要拦截的访问
        filterChainDefinitionMap.put("/common/**", "anon");
        // 对静态资源设置匿名访问
        filterChainDefinitionMap.put("/druid/**", "anon");
        // 配置不会被拦截的链接 顺序判断，因为前端模板采用了thymeleaf，这里不能直接使用 ("/static/**", "anon")来配置匿名访问，必须配置到每个静态目录
        // 配置不会被拦截的链接 顺序判断
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/assets/**", "anon");
        filterChainDefinitionMap.put("/module/**", "anon");
        filterChainDefinitionMap.put("/druid/**", "anon");

        //swagger接口权限 开放
        filterChainDefinitionMap.put("/swagger-ui.html", "anon");
        filterChainDefinitionMap.put("/swagger/**", "anon");
        filterChainDefinitionMap.put("/webjars/**", "anon");
        filterChainDefinitionMap.put("/swagger-resources/**", "anon");
        filterChainDefinitionMap.put("/v2/**", "anon");
        filterChainDefinitionMap.put("/doc.html", "anon");

        // 所有url都必须认证通过才可以访问
        filterChainDefinitionMap.put("/**", "loginFilter,logoutFilter,authc");

        // 所有请求需要认证
        filterChainDefinitionMap.put("/**", "user");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    /**
     * thymeleaf模板引擎和shiro框架的整合
     */
    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }

    /**
     * 凭证匹配器（由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了）
     * 下面调用了自定义的验证类 这个方法就没有了
     *
     * @return
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        //散列算法：这里使用MD5算法
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        //散列的次数，比如散列两次，相当于md5(md5(""))
        hashedCredentialsMatcher.setHashIterations(1);
        return hashedCredentialsMatcher;
    }

    /**
     * 将自己的验证方式加入容器
     *
     * @return
     */
    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        myShiroRealm.setCredentialsMatcher(new CustomCredentialsMatcher());
        return myShiroRealm;
    }

    /**
     * RedisSessionDAOI shiro sessionDao层的实现 通过redis，使用的是shiro-redis开源插件
     *
     * @return
     */
    @Bean
    public RedisSessionDAO redisSessionDAO() {
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setRedisManager(redisManager());
        redisSessionDAO.setSessionIdGenerator(sessionIdGenerator());
        redisSessionDAO.setKeyPrefix(SESSION_KEY);
        redisSessionDAO.setExpire(EXPIRE);
        return redisSessionDAO;
    }

    /**
     * Session ID生成器
     *
     * @return
     */
    @Bean
    public JavaUuidSessionIdGenerator sessionIdGenerator() {
        return new JavaUuidSessionIdGenerator();
    }

    /**
     * 自定义的sessionManager
     *
     * @return
     */
    @Bean
    public SessionManager sessionManager() {
        MySessionManager mySessionManager = new MySessionManager();
        mySessionManager.setSessionDAO(redisSessionDAO());
        mySessionManager.setGlobalSessionTimeout(86400000L);
        //去除浏览器地址栏中url中JSESSIONID参数
        mySessionManager.setSessionIdUrlRewritingEnabled(false);
        return mySessionManager;
    }

    /**
     * 配置shiro RedisManager，使用的是shiro-redis开源插件
     *
     * @return
     */
    private RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setHost(host);
        redisManager.setPort(port);
        redisManager.setTimeout(timeout);
//        redisManager.setPassword(password);
        return redisManager;
    }

    /**
     * 缓存redis实现，使用的shiro-redis开源查看
     *
     * @return
     */
    @Bean
    public RedisCacheManager cacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        redisCacheManager.setKeyPrefix(CACHE_KEY);
        // 配置缓存的话要求放在session里面的实体类必须有个id标识
        redisCacheManager.setPrincipalIdFieldName("id");
        return redisCacheManager;
    }

    /**
     * 安全管理器，授权管理，配置主要是Realm的管理认证
     *
     * @return
     */
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        // 自定义session管理 使用redis，将自定义的会话管理器注册到安全管理器中
//        securityManager.setSessionManager(sessionManager());
        // 自定义缓存实现 使用redis，将自定义的redis缓存管理器注册到安全管理器中
        securityManager.setCacheManager(cacheManager());
        // 自定义Realm验证
        securityManager.setRealm(myShiroRealm());
        // 记住我
        securityManager.setRememberMeManager(rememberMeManager());
        return securityManager;
    }

    /**
     * 记住我
     *
     * @return
     */
    public CookieRememberMeManager rememberMeManager() {
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        cookieRememberMeManager.setCipherKey(Base64.decode("fCq+/xW488hMTCD+cmJ3aQ=="));
        return cookieRememberMeManager;
    }

    /**
     * cookie 属性设置
     *
     * @return
     */
    public SimpleCookie rememberMeCookie() {
        SimpleCookie cookie = new SimpleCookie("rememberMe");
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookie.setHttpOnly(httpOnly);
        cookie.setMaxAge(maxAge * 24 * 60 * 60);
        return cookie;
    }

    /**
     * 退出过滤器
     *
     * @return
     */
    public ShiroLogoutFilter shiroLogoutFilter() {
        ShiroLogoutFilter shiroLogoutFilter = new ShiroLogoutFilter();
//        shiroLogoutFilter.setLoginUrl(loginUrl);
        //配置登出后重定向的地址，等出后配置跳转到登录接口
        shiroLogoutFilter.setRedirectUrl(loginUrl);
        return shiroLogoutFilter;
    }

    /**
     * 开启Shiro的注解(如@RequiresRoles,@RequiresPermissions),需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator(可选)和AuthorizationAttributeSourceAdvisor)即可实现此功能
     *
     * @return
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    public String getCACHE_KEY() {
        return this.CACHE_KEY;
    }

    public String getSESSION_KEY() {
        return this.SESSION_KEY;
    }

    public Integer getEXPIRE() {
        return this.EXPIRE;
    }

    public String getHost() {
        return this.host;
    }

    public Integer getPort() {
        return this.port;
    }

    public String getPassword() {
        return this.password;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getPath() {
        return this.path;
    }

    public boolean isHttpOnly() {
        return this.httpOnly;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public String getLoginUrl() {
        return this.loginUrl;
    }

    public String getUnauthorizedUrl() {
        return this.unauthorizedUrl;
    }

    public String getIndexUrl() {
        return this.indexUrl;
    }

    public void setEXPIRE(Integer EXPIRE) {
        this.EXPIRE = EXPIRE;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setHttpOnly(boolean httpOnly) {
        this.httpOnly = httpOnly;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setUnauthorizedUrl(String unauthorizedUrl) {
        this.unauthorizedUrl = unauthorizedUrl;
    }

    public void setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ShiroConfig)) return false;
        final ShiroConfig other = (ShiroConfig) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getCACHE_KEY() == null ? other.getCACHE_KEY() != null :
                !this.getCACHE_KEY().equals(other.getCACHE_KEY())) return false;
        if (this.getSESSION_KEY() == null ? other.getSESSION_KEY() != null :
                !this.getSESSION_KEY().equals(other.getSESSION_KEY()))
            return false;
        if (this.getEXPIRE() == null ? other.getEXPIRE() != null : !this.getEXPIRE().equals(other.getEXPIRE()))
            return false;
        if (this.getHost() == null ? other.getHost() != null : !this.getHost().equals(other.getHost())) return false;
        if (this.getPort() == null ? other.getPort() != null : !this.getPort().equals(other.getPort())) return false;
        if (this.getPassword() == null ? other.getPassword() != null :
                !this.getPassword().equals(other.getPassword())) return false;
        if (this.getTimeout() == null ? other.getTimeout() != null : !this.getTimeout().equals(other.getTimeout()))
            return false;
        if (this.getDomain() == null ? other.getDomain() != null : !this.getDomain().equals(other.getDomain()))
            return false;
        if (this.getPath() == null ? other.getPath() != null : !this.getPath().equals(other.getPath())) return false;
        if (this.isHttpOnly() != other.isHttpOnly()) return false;
        if (this.getMaxAge() != other.getMaxAge()) return false;
        if (this.getLoginUrl() == null ? other.getLoginUrl() != null :
                !this.getLoginUrl().equals(other.getLoginUrl())) return false;
        if (this.getUnauthorizedUrl() == null ? other.getUnauthorizedUrl() != null :
                !this.getUnauthorizedUrl().equals(other.getUnauthorizedUrl()))
            return false;
        if (this.getIndexUrl() == null ? other.getIndexUrl() != null :
                !this.getIndexUrl().equals(other.getIndexUrl())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ShiroConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getCACHE_KEY() == null ? 43 : this.getCACHE_KEY().hashCode());
        result = result * PRIME + (this.getSESSION_KEY() == null ? 43 : this.getSESSION_KEY().hashCode());
        result = result * PRIME + (this.getEXPIRE() == null ? 43 : this.getEXPIRE().hashCode());
        result = result * PRIME + (this.getHost() == null ? 43 : this.getHost().hashCode());
        result = result * PRIME + (this.getPort() == null ? 43 : this.getPort().hashCode());
        result = result * PRIME + (this.getPassword() == null ? 43 : this.getPassword().hashCode());
        result = result * PRIME + (this.getTimeout() == null ? 43 : this.getTimeout().hashCode());
        result = result * PRIME + (this.getDomain() == null ? 43 : this.getDomain().hashCode());
        result = result * PRIME + (this.getPath() == null ? 43 : this.getPath().hashCode());
        result = result * PRIME + (this.isHttpOnly() ? 79 : 97);
        result = result * PRIME + this.getMaxAge();
        result = result * PRIME + (this.getLoginUrl() == null ? 43 : this.getLoginUrl().hashCode());
        result = result * PRIME + (this.getUnauthorizedUrl() == null ? 43 : this.getUnauthorizedUrl().hashCode());
        result = result * PRIME + (this.getIndexUrl() == null ? 43 : this.getIndexUrl().hashCode());
        return result;
    }

    public String toString() {
        return "ShiroConfig(" +
                "CACHE_KEY=" + this.getCACHE_KEY() +
                ", SESSION_KEY=" + this.getSESSION_KEY() +
                ", EXPIRE=" + this.getEXPIRE() +
                ", host=" + this.getHost() +
                ", port=" + this.getPort() +
                ", password=" + this.getPassword() +
                ", timeout=" + this.getTimeout() +
                ", domain=" + this.getDomain() +
                ", path=" + this.getPath() +
                ", httpOnly=" + this.isHttpOnly() +
                ", maxAge=" + this.getMaxAge() +
                ", loginUrl=" + this.getLoginUrl() +
                ", unauthorizedUrl=" + this.getUnauthorizedUrl() +
                ", indexUrl=" + this.getIndexUrl() +
                ")";
    }
}

