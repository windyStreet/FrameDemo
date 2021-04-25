package com.windystreet.ano.spring;

import com.windystreet.ano.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-23 16:05
 */
public class AnoTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("anoTest.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.showStrong();
    }
}
