package com.windystreet.test;

import com.windystreet.ioc.spring.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * @author windyStreet
 * @codetime 2021-04-22 10:51
 */

public class UserTest {
    @Test
    public void test() throws IOException {
        File file = new File("conf.xml");
        System.out.println(file.getAbsolutePath());
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("conf.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        user.setName("tom");
        user.setAge(15);
        System.out.println(user.toString());
    }
}

