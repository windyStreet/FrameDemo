package com.windystreet.AOP.aspectJano;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author windyStreet
 * @codetime 2021-04-28 18:13
 */
@Configuration // 作为配置类，替代xml配置文件
@ComponentScan(basePackages = "com.windystreet.AOP.aspectJano")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringConfig {
}
