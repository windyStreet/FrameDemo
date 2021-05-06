package com.windystreet.template.bankdemo;

import com.windystreet.template.bankdemo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-30 15:41
 */

/**
 *
 *
 *  xmlns:context="http://www.springframework.org/schema/context"
 *         xmlns:tx="http://www.springframework.org/schema/tx"
 *
 *
 *        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
 *        http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd
 *
 *     <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
 *         <property name="dataSource" ref="dataSource"></property>
 *     </bean>
 *
 *     <!--创建事物管理器 -->
 *     <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager" >
 *     <!-- 注入数据-->
 *         <property name="dataSource"  ref="dataSource"></property>
 *     </bean>
 *     <!-- 开启事物注解 -->
 *     <tx:annotation-driven transaction-manager="transactionManager" ></tx:annotation-driven>
 *
 *
 * 在service 类上面（获取service类里面方法上面） 添加事物注解
 * @Transactional
 * 添加到类上或者方法上
 */

/**
 * 事务属性
 *
 * propagation 事物传播行为
 *      多事务方法直接进行调用，这个过程中事务 是如何进行管理的
 *      事物方法：对数据库表数据进行变化的操作
 *
 * ioslation 事物隔离级别
 *      多事务操作之间会产生影响
 *      脏读 不可重复读 虚（幻）读
 *
 * timeout 超时时间
 *      事物需要在一定时间内进行提交，如果不进行则进行回滚
 *      默认值是-1，单位 秒
 *
 * readOnly 是否只读
 *      默认值 false
 *      设置为true，只能查询 不能修改
 *
 * rollbackFor 回滚
 *      设置出现哪些异常，进行回滚操作
 *
 * noRollbackFor 不会滚
 *      设置出现哪些异常，不进行回滚操作
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bankDemoTest.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.tranMoney();
    }
}
