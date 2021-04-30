package com.windystreet.template.bankdemo;

import com.windystreet.template.bankdemo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-30 15:41
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bankDemoTest.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.tranMoney();
    }
}
