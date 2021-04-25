package com.windystreet.ano.spring.service;

import com.windystreet.ano.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
    // 不需要添加set方法
    // 添加注入属性注解
    @Autowired // 根据类型注入
    private UserDao userDao;

    public void showStrong() {
        System.out.println("showStrong....");
    }
}
