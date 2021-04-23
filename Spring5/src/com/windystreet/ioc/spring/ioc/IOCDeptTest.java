package com.windystreet.ioc.spring.ioc;

import com.windystreet.ioc.spring.ioc.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-22 16:11
 */
public class IOCDeptTest {

    /**
     * 注入内部bean
     */
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dep.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.showDepart();
        System.out.println(emp.toString());
//        FileSystemXmlApplicationContext
    }
    /**
     * 级联赋值bean
     */

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dep1.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.showDepart();
        System.out.println(emp.toString());
//        FileSystemXmlApplicationContext
    }

    /**
     * 级联赋值bean
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dep2.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.showDepart();
        System.out.println(emp.toString());
//        FileSystemXmlApplicationContext
    }

}
