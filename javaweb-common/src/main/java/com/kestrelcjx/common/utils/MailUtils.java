package com.kestrelcjx.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

/**
 * 邮件发送工具类
 */
@Component
public class MailUtils {
    private final Logger logger = LoggerFactory.getLogger(MailUtils.class);
    @Value("${spring.mail.username}")
    private String from;
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private TemplateEngine templateEngine;

    /**
     * 发送普通文本邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 内容
     */
    public void sendSimpleMail(String to, String subject, String content) {
        logger.info("发送邮件开始！");
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            // 收信人
            message.setTo(to);
            // 主题
            message.setSubject(subject);
            // 内容
            message.setText(content);
            // 发信人
            message.setFrom(from);
            mailSender.send(message);
            logger.info("邮件发送成功");
        } catch (Exception e) {
            logger.error("邮件发送异常：", e);
        }
    }

    /**
     * 发送HTML邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 内容（可以包含<html>等标签）
     */
    public void sendHtmlMail(String to, String subject, String content) {
        logger.info("发送HTML邮件开始：{},{},{}", to, subject, content);
        // 使用MimeMessage，MIME协议
        MimeMessage message = mailSender.createMimeMessage();
        // MimeMessageHelper帮助我们设置更多丰富的内容
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            // true代表支持html
            helper.setText(content, true);
            ClassPathResource logoImage = new ClassPathResource("static/1.jpeg");
            helper.addInline("logoImage", logoImage);
            mailSender.send(message);
            logger.info("发送HTML邮件成功");
        } catch (MessagingException e) {
            logger.error("发送HTML邮件失败：", e);
        }
    }

    /**
     * 发送带附件的邮件
     *
     * @param to       收件人
     * @param subject  主题
     * @param content  内容
     * @param filePath 附件路径
     */
    public void sendAttachmentMail(String to, String subject, String content, String filePath) {
        logger.info("发送带附件邮件开始：{},{},{},{}", to, subject, content, filePath);
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(message, true);
            // true代表支持多组件，如附件，图片等
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            mailSender.send(message);
            logger.info("发送带附件邮件成功");
        } catch (MessagingException e) {
            logger.error("发送带附件邮件失败：", e);
        }
    }

    /**
     * 发送带图片的邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 文本
     * @param rscPath 图片路径
     * @param rscId   图片ID，用于在<img>标签中使用，从而显示图片
     */
    public void sendInlineResourceMail(String to, String subject, String content,
                                       String rscPath, String rscId) {
        logger.info("发送带图片邮件开始：{},{},{},{},{}", to, subject, content, rscPath, rscId);
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            helper.setSentDate(new Date());
            FileSystemResource res = new FileSystemResource(new File(rscPath));
            // 重复使用添加多个图片
            helper.addInline(rscId, res);
            mailSender.send(message);
            logger.info("发送带图片邮件成功");
        } catch (MessagingException e) {
            logger.error("发送带图片邮件失败：", e);
        }
    }

    /**
     * 发送模板邮件
     *
     * @param to 收件人
     * @param subject 主题
     * @param tplPath 模板路径
     * @param object 模板参数
     */
    public void sendTemplateMail(String to, String subject, String tplPath, Object object) {
        logger.info("发送Template邮件开始：{},{},{}", to, subject, tplPath);
        // 利用Thymeleaf模板构建html文本
        Context ctx = new Context();
        // 给模板的参数的上下文
        ctx.setVariable("info", object);
        // 执行模板引擎，执行模板引擎需要传入模板名、上下文对象
        // Thymeleaf的默认配置期望所有HTML文件都放在**resources/templates**目录下，以.html扩展名结尾
        String content = templateEngine.process(tplPath, ctx);
        // 使用MimeMessage，MIME协议
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            // true代表支持html
            helper.setText(content, true);
            mailSender.send(message);
            logger.info("发送HTML邮件成功");
        } catch (MessagingException e) {
            logger.error("发送HTML邮件失败：", e);
        }
    }
}
