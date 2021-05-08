package com.windystreet.template.bankdemo.service;

import com.windystreet.template.bankdemo.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author windyStreet
 * @codetime 2021-04-30 15:50
 */
@Service
//@Transactional
//@Transactional(propagation = Propagation.REQUIRED)
//@Transactional(propagation = Propagation.REQUIRED ,isolation = Isolation.REPEATABLE_READ) // 可重复读
//@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserDao userDao;

    //
    public void tranMoney() {
        userDao.reduceMoney();
        System.out.println("先少100块");
        log.info("先少100块");
//        int i = 10 / 0;
        userDao.addMoney();
        System.out.println("再加100块");
        log.info("再加100块");
    }
}
