package com.windystreet.spring.ioc;

import com.windystreet.spring.ioc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-22 15:52
 */
public class IOCUserDaoTest {
    /**
     * 注入外部bean
     */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserDao.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
