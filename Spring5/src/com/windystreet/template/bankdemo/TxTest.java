package com.windystreet.template.bankdemo;

import com.windystreet.template.bankdemo.conf.TxConfig;
import com.windystreet.template.bankdemo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-05-06 18:07
 */
public class TxTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.tranMoney();
    }
}
