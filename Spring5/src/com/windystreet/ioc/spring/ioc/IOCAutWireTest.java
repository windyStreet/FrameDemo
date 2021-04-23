package com.windystreet.ioc.spring.ioc;

import com.windystreet.ioc.spring.ioc.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-23 10:55
 */
public class IOCAutWireTest {
    /**
     * 自动装配
     * 1、根据指定装配规则（属性名称或属性类型），Spring 自动将匹配的属性值进行注入
     */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
        emp.test();
    }
}
