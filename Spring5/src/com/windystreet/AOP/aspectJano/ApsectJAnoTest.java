package com.windystreet.AOP.aspectJano;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-29 17:25
 */
public class ApsectJAnoTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("AopBean.xml");
        User user = context.getBean("user1", User.class);
        user.add();
    }
}
