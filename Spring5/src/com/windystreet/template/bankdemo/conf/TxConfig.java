package com.windystreet.template.bankdemo.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author windyStreet
 * @codetime 2021-05-06 17:59
 */
@Configuration
@ComponentScan(basePackages = "com.windystreet.template.bankdemo")
@EnableTransactionManagement // 开启事务
public class TxConfig {

    // 创建数据库链接池
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://192.168.5.137:3306/book_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("longrise");
        return druidDataSource;

    }

    // 创建jdbc模板对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        // 到ioc 容器中根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    // 创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
