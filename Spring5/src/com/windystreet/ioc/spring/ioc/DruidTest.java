package com.windystreet.ioc.spring.ioc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author windyStreet
 * @codetime 2021-04-23 15:09
 */
public class DruidTest {
    /**
     * 创建一个外部属性文件，properties
     * 把外部properties属性文件引入到spring配置文件中
     * 引入 context 名称空间
     * 在spring配置文件使用标签引入外部属性文件
     */

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.toString());

    }
}
