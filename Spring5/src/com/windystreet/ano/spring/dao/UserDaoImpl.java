package com.windystreet.ano.spring.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author windyStreet
 * @codetime 2021-04-23 16:53
 */

@Repository(value ="userDaoImpl" )
public class UserDaoImpl implements  UserDao{
    @Override
    public void show() {
        System.out.println("UserDaoImpl show ....");
    }
}
