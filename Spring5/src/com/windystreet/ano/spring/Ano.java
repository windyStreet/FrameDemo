package com.windystreet.ano.spring;

/**
 * @author windyStreet
 * @codetime 2021-04-23 15:26
 */
public class Ano {
    /**
     * 注解是代码特殊标记： 格式 @注解名称（属性名称=属性值，属性名称=属性值，...）
     * 使用注解，注解作用在类、方式、属性上面
     * 使用注解的目的：简化xml配置
     */
    /**
     * spring 针对Bean管理中创建对象提供注解
     * @Component
     * @Service
     * @Controller
     * @Repository
     * 四个注解功能都是一样的，都可以从来创建bean实例。
     * 常用来区分代码层次和逻辑
     */
    /**
     * 基于注解常见bean对象
     * 基于注解方式实现对象创建
     * 1、引入依赖 spring-aop-5.3.6.jar
     * 2、开启组件扫描
     * 3、创建类，在类上面添加对象的注解
     */
    /**
     * 基于注解方式实现属性注入
     * 1、@AutoWired 根据属性类型进行自动装配
     * 2、@Qualifier 根据属性名称进行注入
     * 3、@Resource 可以根据类型注入 可以根据名称注入
     * 4、@Value 注入普通类型属性
     *
     * A、 在service 和 dao 对象创建，在service 和 dao类天安家创建对象注解
     * B、在service 注入 dao对象，在service类添加dao类型属性，在属性上面使用注解【不需要添加set方法】
     */
}
