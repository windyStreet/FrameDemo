package com.windystreet.ano.spring.anodevelop.config;

import com.windystreet.ano.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-28 18:15
 */
public class SpringConfigTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.showStrong();
        System.out.println(userService.toString());
    }
}
