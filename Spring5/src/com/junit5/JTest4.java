package com.junit5;

import com.windystreet.template.bankdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author windyStreet
 * @codetime 2021-05-08 9:08
 */

/**
 * Junit4引入 需要先引入junit4 依赖包
 */
@RunWith(SpringJUnit4ClassRunner.class) // 单元测试框架
@ContextConfiguration("classpath:bankDemoTest.xml") // 加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.tranMoney();
    }

}
