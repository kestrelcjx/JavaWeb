package com.kestrelcjx.system.utils;

import com.kestrelcjx.common.utils.SpringUtils;
import com.kestrelcjx.system.entity.Admin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.Authenticator;
import org.apache.shiro.authc.LogoutAware;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.crazycake.shiro.RedisSessionDAO;

import java.util.Collection;
import java.util.Objects;

/**
 * Shiro工具类
 */
public class ShiroUtils {
    private ShiroUtils() {

    }

    private static RedisSessionDAO redisSessionDAO = SpringUtils.getBean(RedisSessionDAO.class);

    /**
     * 获取当前用户Session
     *
     * @return
     */
    public static Session getSession() {
        return SecurityUtils.getSubject().getSession();
    }

    /**
     * 用户退出
     */
    public static void logout() {
        SecurityUtils.getSubject().logout();
    }

    /**
     * 获取当前用户信息
     *
     * @return
     */
    public static Admin getAdminInfo() {
        return (Admin) SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 获取用户编号
     *
     * @return
     */
    public static Integer getAdminId() {
        Admin admin = getAdminInfo();
        return admin.getId();
    }

    /**
     * 删除用户缓存信息
     *
     * @param username        用户名称
     * @param isRemoveSession 是否删除Session
     */
    public static void deleteCache(String username, boolean isRemoveSession) {
        // 从缓存中获取Session
        Session session = null;
        Collection<Session> sessions = redisSessionDAO.getActiveSessions();
        Admin admin;
        Object attribute = null;
        for (Session sessionInfo : sessions) {
            // 遍历Session，找到该用户名称对应的Session
            attribute = sessionInfo.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
            if (null == attribute) {
                continue;
            }
            admin = (Admin) ((SimplePrincipalCollection) attribute).getPrimaryPrincipal();
            if (null == admin) {
                continue;
            }
            if (Objects.equals(admin.getUsername(), username)) {
                session = sessionInfo;
                break;
            }
        }
        if (null == session || null == attribute) {
            return;
        }
        // 删除Session
        if (isRemoveSession) {
            redisSessionDAO.delete(session);
        }
        // 删除Cache，在访问受限接口时会重新授权
        DefaultWebSecurityManager securityManager = (DefaultWebSecurityManager) SecurityUtils.getSecurityManager();
        Authenticator authenticator = securityManager.getAuthenticator();
        ((LogoutAware) authenticator).onLogout((SimplePrincipalCollection) attribute);
    }
}
