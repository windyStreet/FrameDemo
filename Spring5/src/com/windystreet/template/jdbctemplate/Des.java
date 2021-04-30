package com.windystreet.template.jdbctemplate;

/**
 * @author windyStreet
 * @codetime 2021-04-30 9:46
 */
public class Des {
/**
 * druid-1.2.5.jar
 * spring-jdbc-5.3.6.jar
 * spring-orm-5.3.6.jar
 * spring-tx-5.3.6.jar
 * mysql-connector-java-8.0.23.jar
 */

    /**
     * Spring 框架对 JDBC 进行封装，使用JDBCTemplate 方便实现对数据库操作
     *
     * 引入依赖
     * 数据库链接池配置
     * 配置JdbcTemplate对象，注入DataSource
     * 创建service 类 创建dao类，在dao注入jdbcTemplate对象
     */
    /**
     * 编写service 和 dao
     * 在dao进行数据库添加操作
     * 调用JdbcTemplate 对象里面update实现添加操作
     * update(String sql, Object... args)
     * 参数一 sql语句
     * 参数二 可变参数，设置sql语句值
     */

    /**
     * 事物操作
     * 事物是数据库操作最基本单元，逻辑上一组操作，要么都成功，如果有一个失败所有操作都失败
     *
     * 事物四个性
     * 原子性 A
     * 一致性 C
     * 隔离性 I
     * 持久性 D
     *
     * 操作环境
     *
     */
}
