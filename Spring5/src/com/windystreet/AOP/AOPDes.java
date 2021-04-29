package com.windystreet.AOP;

/**
 * @author windyStreet
 * @codetime 2021-04-29 11:29
 */
public class AOPDes {
    /**
     * AOP 面向切面（方面）编程
     * 1、业务逻辑部分进行隔离
     * 2、降低耦合度
     * 3、提高程序的可重用行
     * 4、提高开发效率
     *
     * 不通过修改源代码的方式，在主干功能中新增功能
     */
    /**
     * AOP 底层
     * 动态代理
     * 1、有接口的情况下
     * 2、没有接口的情况 CGLIB动态代理
     */

    /**
     * 术语
     * 1、连接点
     * 2、切入点
     * 3、通知（增强）
     * 4、切面
     */

    /**
     * Spring 一般都是基于AspectJ 实现AOP操作
     * AspectJ 是一个独立的AOP框架，一般把AspectJ 和Spring 框架一起使用，进行AOP操作
     * 基于 AspectJ 实现 AOP操作
     * 基于xml
     * 基于注解【常用】
     */
    /**
     * 切入点表达式
     * execution([权限修饰符][返回类型][类全路径][方法名称][参数列表])
     * 空格隔开
     */
    /**
     * 在spring配置文件中，开启注解扫描
     *      在xml中添加context aop名称空间
     *      添加扫描类
     * 使用注解创建User和UserProxy
     *      类上添加注解 @Component
     * 在增强类上面添加注解@Aspect
     *      UserProxy类添加@Aspect注解
     * 在spring 配置文件中开启生成代理对象
     *      在xml中添加<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
     *  配置不同类型的通知
     *      在增强类的里面，在作为通知方法上添加通知类型注解，使用切入点表达式配置
     */
    /**
     * 相同的切入点的抽取
     *
     *  @Pointcut(value = "execution(* com.windystreet.AOP.aspectJano.User.*(..))")
     *     public void pointDemo() {
     *         // 方法名随意
     *         // 相同的切入点的抽取
     *     }
     *
     *     // 前置通知
     *     @Before(value = "pointDemo()")
     *       public void before() {
     *         System.out.println("userProxy before....");
     *     }
     *
     */
    /**
     * 多个增强类对同一个方法进行增强，设置增强类优先级
     * @Component
     * @Aspect
     * @Order(value = 1) z数字类型值越小优先级越高
     */

}
