package com.suollon.coding.dingding.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;

/**
 * 1，在POM中引入spring-boot-starter-mail
 * 2，配置JavaMailSender
 *      spring.mail.host=smtp.163.com
 *      spring.mail.username=suollon
 *      #授权码
 *      spring.activemq.password=kikixi666
 * 3，发送邮件
 *
 * @author hzwwl
 * @date 2019/9/10 10:35
 */
public class SpringEmailTest {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("suollon@163.com");
        message.setTo("745345616@qq.com");
        message.setSubject("邮件标题");
        message.setText("邮件内容");
        javaMailSender.send(message);
    }

    public void sendMimeMail() throws Exception {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setFrom("suollon@163.com");
        helper.setTo("745345616@qq.com");
        helper.setSubject("邮件标题");
        helper.setText("邮件内容");
        //helper.addInline("doge.gif", new File("xx/xx/doge.gif"));
        //helper.addAttachment("work.docx", new File("xx/xx/work.docx"));
        javaMailSender.send(message);
    }

}
