package com.windystreet.ano.spring.anodevelop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author windyStreet
 * @codetime 2021-04-28 18:13
 */
@Configuration // 作为配置类，替代xml配置文件
@ComponentScan(basePackages = "com.windystreet.ano.spring")
public class SpringConfig {
}
