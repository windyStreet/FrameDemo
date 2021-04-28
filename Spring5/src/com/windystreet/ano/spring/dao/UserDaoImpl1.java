package com.windystreet.ano.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author windyStreet
 * @codetime 2021-04-23 16:53
 */

@Repository(value ="userDaoImpl1" )
public class UserDaoImpl1 implements  UserDao{
    @Override
    public void show() {
        System.out.println("UserDaoImpl1 show ....");
    }
}
