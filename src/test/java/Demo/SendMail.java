package Demo;

import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@SpringBootTest
public class SendMail {
    static String Content(String code) {
        String Con=null;
        Con="<!DOCTYPE html>\r\n"
                + "<HTML>\r\n"
                + "<HEAD>\r\n"
                + "<META  charset=\" gbk\">\r\n"
                + "<TITLE>登录验证码邮件</TITLE>\r\n"
                + "</HEAD>\r\n"
                + "<BODY>\r\n"
                + "<h1>你的验证码为："+code
                + " 请妥善保管</h1>\r\n"
                + "    <h1>生活愉快</h1>\r\n"
                + "    <p>每天开心！</p>\r\n"
                + "    <img src=\"https://pic4.zhimg.com/v2-1b1ea64759584f6b9d90f0bfa32cb5af_r.jpg\" width=\"900\" height=\"600\" />\r\n"
                + "</BODY>\r\n"
                + "</HTML>";
        return Con;
    }
    public static void main(String[] args) throws MessagingException {



        Properties pro = new Properties();

        pro.setProperty("mail.host", "smtp.qq.com");//mail.host=smtp.qq.com

        pro.setProperty("mail.transport.protocol", "smtp");

        pro.setProperty("mail.smtp.auth", "true");

        pro.setProperty("mail.smtp.port","465");

        System.out.println("port:"+pro.getProperty("mail.smtp.port"));

        Auth auth=new Auth();

        Session session= Session.getDefaultInstance(pro,auth);

        Transport ts=session.getTransport();

        ts.connect("smtp.qq.com","2116639781@qq.com","ztwbghhmitimehga");

        MimeMessage message=new MimeMessage(session);

        message.setFrom(new InternetAddress("2116639781@qq.com"));

//        message.setRecipient(Message.RecipientType.TO,new InternetAddress("li2116639781@sina.com"));
        message.setRecipient(Message.RecipientType.TO,new InternetAddress("2751488527@qq.com"));

        message.setSubject("登录验证码邮件");

        message.setContent(Content("5678"),"text/html;charset=utf-8");

        ts.sendMessage(message, message.getAllRecipients());

        ts.close();
        System.out.println("发送成功");
    }

}
