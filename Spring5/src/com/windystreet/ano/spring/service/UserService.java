package com.windystreet.ano.spring.service;

import com.windystreet.ano.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author windyStreet
 * @codetime 2021-04-23 16:00
 */
// 在注解里面value可以省略
// 默认值是类名，首字母小写
//@Component() == @Component(value = "userService")

//-----------------------
//@Component(value = "userService") // <bean id="userService" value="类路径">
@Service
public class UserService {
    //定义dao类型属性
    // 不需要添加set方
//    public UserService(UserDao userDao) {
//        this.userDao = userDao;
//    }
// ----------------------------------------
// 添加注入属性注解
//    @Autowired // 根据类型注入
//    @Qualifier(value = "userDaoImpl1") // 根据名称注入
//    private UserDao userDao;
// ----------------------------------------
//
//    @Autowired
//    @Qualifier(value = "userDaoImpl1") // 根据名称注入 //    @Qualifier(value = "userDaoImpl")
//    private UserDao userDao;
// ----------------------------------------
// javax 提供
//    @Resource // 根据类型注入 只能由一个实现
    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    @Value(value = "dbTest")
    private String dbName;

    public void showStrong() {
        System.out.println("showStrong....");
        userDao.show();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                ", dbName='" + dbName + '\'' +
                '}';
    }
}
