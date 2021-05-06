package com.windystreet.template.bankdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author windyStreet
 * @codetime 2021-04-30 15:50
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money+? where userName = ?";
        jdbcTemplate.update(sql, 100, "marry");

    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money-? where userName = ?";
        jdbcTemplate.update(sql, 100, "tom");

    }
}
