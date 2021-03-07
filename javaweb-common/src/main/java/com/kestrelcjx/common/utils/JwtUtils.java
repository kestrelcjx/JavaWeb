package com.kestrelcjx.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Jwt工具类
 */
public class JwtUtils {
    /**
     * token数组
     */
    public static final String key = "KfxcZITlSBpzE2mgb3eJno";
    /**
     * token过期时间（10个小时）
     */
    public static final long ttlMillis = 3600_000_000L;

    /**
     * 用户登录成功后生成Jwt
     * 使用Hs256算法，私匙使用用户密码
     *
     * @param userId 登录成功userId
     * @return
     */
    public static String createJWT(Integer userId) {
        // 指定签名的时候使用的签名算法，也就是header部分，jjwt已经将这部分内容封装好了
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        // 生成JWT的时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        // 创建payload的私有声明
        // 根据特定的业务需要添加，如果要拿这个做验证，一般是需要和jwt的接受方法提前沟通好验证方式的
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", userId);
        // 生成签发人
        String subject = "JWT";
        // 为payload添加各种标准声明私有声明
        JwtBuilder builder = Jwts.builder()
                // 如果有私有声明一定要先设置这个自己创建的私有的声明，这个是给builder的claim赋值
                // 一旦写在标准声明赋之后，将覆盖了那些标准的声明
                .setClaims(claims)
                // 设置jti(JWt ID):是JWT的唯一标识
                // 根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token，从而回避重放攻击
                .setId(UUID.randomUUID().toString())
                // jat: jwt的签发时间
                .setIssuedAt(now)
                // 代表这个JWT的主体，即它的所有人，这个是一个json格式的字符串
                // 可以存放userid,roldid之类的，作为用户的唯一标识
                .setSubject(subject)
                // 设置签名使用的签名算法和签名使用的私钥
                .signWith(signatureAlgorithm, key);
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            // 设置过期时间
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    /**
     * token的解密
     *
     * @param token 加密后的token
     * @return
     */
    public static Claims parseJWT(String token) {
        // 得到DefaultJwtParser
        Claims claims = Jwts.parser()
                // 设置签名的秘钥
                .setSigningKey(key)
                // 设置需要解析的jwt
                .parseClaimsJws(token).getBody();
        return claims;
    }

    /**
     * 校验token
     * 在这里可以重复使用官方的校验，这里校验的是token中携带的密码与数据库一致的话就校验通过
     *
     * @param token
     * @param userId
     * @return
     */
    public static Boolean isVerifier(String token, Integer userId) {
        // 得到DefaultJwtParser
        Claims claims = Jwts.parser()
                // 设置签名的秘钥
                .setSigningKey(key)
                // 设置需要解析的jwt
                .parseClaimsJws(token).getBody();
        if (claims.get("id").equals(userId)) {
            return true;
        }
        return false;
    }
}
