package com.windystreet.ioc.spring.ioc;

import com.windystreet.ioc.spring.ioc.collection.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-22 16:31
 */
public class IOCCollectionTest {
    /**
     * 注入数组类型属性
     */
    /**
     * 注入List集合类型属性
     */
    /**
     * 注入Map集合类型属性
     */
    /**
     * 注入对象类型值
     */
    @Test
    public void test(){
        ApplicationContext context =  new  ClassPathXmlApplicationContext("student.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());
    }


    /**
     * 提取公用
     * 在spring 配置文件中引入名称空间 util
     * xmlns:util="http://www.springframework.org/schema/util"
     * http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd ">
     */
    @Test
    public void test1() {
        ApplicationContext context =  new  ClassPathXmlApplicationContext("student1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());
    }

    @Test
    public void test2() {

    }
}
