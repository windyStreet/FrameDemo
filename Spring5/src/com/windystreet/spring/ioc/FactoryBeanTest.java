package com.windystreet.spring.ioc;

import com.windystreet.spring.ioc.collection.Course;
import com.windystreet.spring.ioc.facbean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-22 18:29
 */
public class FactoryBeanTest {
    /**
     * Spring 的两种bean
     * 普通bean 在配置文件中定义类型和返回类型必须一样
     * FactoryBean 工厂bean 在配置文件中定义类型和返回类型可以不一样
     */

    /**
     * 1、创建类，让这个类作为工厂bean，实现接口FactoryBean
     * 2、实现接口里面的方法，在实现的方法中定义返回的bean的类型
     */

    @Test
    public void test(){
     ApplicationContext context = new ClassPathXmlApplicationContext("mybean.xml");
//        MyBean myBean = context.getBean("MyBean", MyBean.class);
//        System.out.println(myBean.toString());
        Course courseBean = context.getBean("MyBean", Course.class);
        System.out.println(courseBean.toString());

    }


}
