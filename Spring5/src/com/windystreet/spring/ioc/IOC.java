package com.windystreet.spring.ioc;

/**
 * @author windyStreet
 * @code time 2021-04-22 11:37
 * <p>
 * IOC 底层原理
 * IOC 接口（BeanFactory）
 * IOC 操作Bean 管理（基于xml、基于注解）
 * <p>
 * IOC:控制反转，把对的创建和对象调用过程，交给Spring 进行管理
 * 目的：降低耦合度
 * <p>
 * 底层原理
 * 1、xml解析 工厂模式 反射
 * <p>
 * IOC 底层原理
 * IOC 接口（BeanFactory）
 * IOC 操作Bean 管理（基于xml、基于注解）
 * <p>
 * IOC:控制反转，把对的创建和对象调用过程，交给Spring 进行管理
 * 目的：降低耦合度
 * <p>
 * 底层原理
 * 1、xml解析 工厂模式 反射
 * <p>
 * IOC 底层原理
 * IOC 接口（BeanFactory）
 * IOC 操作Bean 管理（基于xml、基于注解）
 * <p>
 * IOC:控制反转，把对的创建和对象调用过程，交给Spring 进行管理
 * 目的：降低耦合度
 * <p>
 * 底层原理
 * 1、xml解析 工厂模式 反射
 */

/**
 * IOC 底层原理
 * IOC 接口（BeanFactory）
 * IOC 操作Bean 管理（基于xml、基于注解）
 */

/**
 * IOC:控制反转，把对的创建和对象调用过程，交给Spring 进行管理
 * 目的：降低耦合度
 */

/**
 * 底层原理
 * 1、xml解析 工厂模式 反射
 */

import com.windystreet.spring.Book;
import com.windystreet.spring.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC 思想基于IOC容器完成，IOC容器底层就是对象工厂
 * Spring 提供IOC容器实现放是两种
 * A、BeanFactory:IOC 容器基本实现，是Spring内部的使用接口，不提供开发人员使用【加载配置文件时不会创建对象，在获取对象（使用）才去创建对象】
 * B、ApplictionContext:BeanFactory 接口的子接口，提供更多更强大的功能，一般由开发人员进行使用【加载配置文件时就会把配置文件对象进行创建】
 */

/**
 * IOC Bean 管理
 * Bean管理指的是两个操作：1、Spring创建对象 2、Spring注入属性
 * Bean管理的两种操作方式
 * 1、xm配置文件方式
 * 2、注解方式
 */
public class IOC {
    @Test
    public void test() {
        //ApplicationContext applicationContext = new ApplicationContext();

    }

    @Test
    public void createObj() {
        //<bean id="user" class="com.windystreet.spring.User">
        // spring 配置文件中，使用bean标签，标签里面对应属性，就可以实现对象创建
        // bean 标签中有很多属性
        /**
         * id 唯一表示【不能有特殊符号】
         * class  类全路径（包类路径）
         * name 【可以存在特殊符号】
         */
        // 创建对象的时候，默认也是执行的无参的构造方式

        // 基于xml方法注入属性
        // DI:依赖注入，就是注入属性【在创建对象的前提下】
        /**
         * set方法注入
         * 有参构造方法注入
         */
    }

    // set 注入
    @Test
    public void CreateObjBySet() {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());
        book.readBook();
    }

    // 构造器注入
    @Test
    public void CreateObjectByConstructor() {

        ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
        Order oder = context.getBean("order", Order.class);
        oder.orderTest();
    }

    // p 名称空间注入【了解】
    // 使用p名称空间注入，可以简化基于xml配置方式
    // xmlns:p="http://www.springframework.org/schema/p"
    // <bean id="order-1" class="com.windystreet.spring.Order" p:orderNmae="xxx" p:price="0.05"></bean>


//    IOC xml注入其他类型属性
    //1、字面量
    /**
     * null 值
     *         <property name="address" >
     *             <null/>
     *         </property>
     * Book{Address='null', name='代码设计模式', author='秦小波'}
     */
    // 属性值中包含特殊符号
    /**
     *
     */

    //注入属性 内部bean 外部bean 级联bean

    /**
     * 1、创建Service 类，创建Dao类
     */

}
