package com.junit5;

import com.windystreet.template.bankdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

/**
 * @author windyStreet
 * @codetime 2021-05-08 10:42
 */
//@ExtendWith(SpringExtension.class) // 单元测试框架
//@ContextConfiguration("classpath:bankDemoTest.xml") // 加载配置文件
@SpringJUnitConfig(locations = "classpath:bankDemoTest.xml") //--> 替代上面两个注解
public class JTest5 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.tranMoney();
    }
}



