package com.windystreet.template.bankdemo.service;

import com.windystreet.template.bankdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author windyStreet
 * @codetime 2021-04-30 15:50
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void tranMoney() {
        try {
            userDao.reduceMoney();
            int i = 10 / 0;
            userDao.addMoney();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
}
