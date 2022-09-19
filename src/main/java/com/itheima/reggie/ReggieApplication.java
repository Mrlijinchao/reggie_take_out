package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 使用@ServletComponentScan 注解后
 * Servlet可以直接通过@WebServlet注解自动注册
 * Filter可以直接通过@WebFilter注解自动注册
 * Listener可以直接通过@WebListener 注解自动注册
 */
@ServletComponentScan
@MapperScan("com.itheima.reggie.mapper")
@Slf4j
@SpringBootApplication
@EnableTransactionManagement//加事务
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("项目启动成功...");
    }
}
