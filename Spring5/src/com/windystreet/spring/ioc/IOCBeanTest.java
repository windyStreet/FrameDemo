package com.windystreet.spring.ioc;

import com.windystreet.spring.User;
import com.windystreet.spring.ioc.lifecycle.Life;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-23 9:54
 */
public class IOCBeanTest {
    /**
     * bean的作用域
     * 在spring里面，这是bean是单实例还是多实例
     * 在默认情况下，bean是单实例
     * 设置单实例或者多实例 scope
     * scope值
     * 默认：singleton 单实例
     * prototype 多实例
     * request session 实例会存储到 request、session中
     */

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("iocbean.xml");
        User person1 = context.getBean("person", User.class);
        User person2 = context.getBean("person", User.class);
//        <bean id="person" class="com.windystreet.spring.User" scope="prototype"></bean>
//        System.out.println(person1 == person2); // false
//        <bean id="person" class="com.windystreet.spring.User"></bean>
//        <bean id="person" class="com.windystreet.spring.User" scope="singleton"></bean>
        System.out.println(person1 == person2); // true

    }

    /**
     * 生命周期
     * 从对象从创建到对象销毁的过程
     * bean 的生命周期 【bean的后置处理器*】
     * 1、通过构造器创建bean实例（无参构造）
     * 2、为bean的属性设置值和对其他bean引用（调用set方法）
     * 3.0 把bean的实例传递bean 后置处理器的方法
     * 3、调用bean的初始化的方法（需要进行配置初始化的方法）
     *  3.1 把bean的实例传递bean 后置处理器的方法
     * 4、bean可以使用了（对象获取）
     * 5、当容器关闭的时候，调用bean的销毁方法（需要进行配置销毁的方法）
     */
    @Test
    public void test1(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Life lifecycle = context.getBean("lifecycle", Life.class);
        System.out.println("生成bean对象");
        System.out.println(lifecycle.toString());
//        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext) context;
//        context1.close();
//        ((ClassPathXmlApplicationContext) context).close();
        context.close();

    }

}
