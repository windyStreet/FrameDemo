package com.windystreet.AOP.jdkaop;

/**
 * @author windyStreet
 * @codetime 2021-04-29 14:23
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String str) {
        return str+"aa";

    }
}
