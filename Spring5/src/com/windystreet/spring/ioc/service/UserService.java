package com.windystreet.spring.ioc.service;

import com.windystreet.spring.ioc.dao.UserDao;

/**
 * @author windyStreet
 * @codetime 2021-04-22 15:33
 */
public class UserService {

    // 创建UserDao类型属性，生成set方法
    private UserDao _userDao;

    public void setUserDao(UserDao userDao) {
        this._userDao = userDao;
    }


    public void add() {
        System.out.println("UserService add");

        // UserDao userDao = new UserDaoImp();
        // userDao.update();
        _userDao.update();
    }
}
