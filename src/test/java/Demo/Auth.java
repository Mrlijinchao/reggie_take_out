package Demo;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


public class Auth extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("2116639781@qq.com","dwajmztuyxtcdici");
    }
}

/*
    IPV6与IPV4的相互转换

    IPV6 为 128bit     16bit X 8
    IPV4 为 64bit      8bit X 4

        例：  192.168.0.118 == 11000000 10101000 00000000 01110110 ==
             1100 0000 1010 1000 : 0000 0000 0111 0110 == c0a8:0076
        即
        192.168.0.118 → 0000：0000：0000：0000：0000：0000：c0a8：0076
        c0a8:0076         0可省略变成       ::c0a8:0076 或 ::c0a8:0:76
        IPv6为十六进制，所以转换成十进制的IPv4就变成：
        c0=192  ：a8=168  ：0=00  ：76=118

 */



