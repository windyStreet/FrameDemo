package com.windystreet.AOP.aspectJano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author windyStreet
 * @codetime 2021-04-29 17:10
 */

@Component
@Aspect
public class UserProxy {
    @Pointcut(value = "execution(* com.windystreet.AOP.aspectJano.User.*(..))")
    public void pointDemo() {
        // 方法名随意
        // 相同的切入点的抽取
    }

    // 前置通知
//    @Before(value = "execution(* com.windystreet.AOP.aspectJano.User.*(..))")
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("userProxy before....");
    }

    // 最终通知
    @After(value = "execution(* com.windystreet.AOP.aspectJano.User.add(..))")
    public void after() {
        System.out.println("userProxy after....");
    }

    // 后置通知【返回通知】
    @AfterReturning(value = "execution(* com.windystreet.AOP.aspectJano.User.add(..))")
    public void afterReturning() {
        System.out.println("userProxy afterReturning....");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.windystreet.AOP.aspectJano.User.add(..))")
    public void afterThrowing() {
        System.out.println("userProxy afterThrowing....");
    }

    //环绕通知
    @Around(value = "execution(* com.windystreet.AOP.aspectJano.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("userProxy around start....");
        proceedingJoinPoint.proceed();
        System.out.println("userProxy around end....");
    }

}
