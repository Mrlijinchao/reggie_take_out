package com.itheima.reggie.mail;

import org.springframework.stereotype.Component;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

@Component
public class Auth extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("2116639781@qq.com","dwajmztuyxtcdici");
    }
}
