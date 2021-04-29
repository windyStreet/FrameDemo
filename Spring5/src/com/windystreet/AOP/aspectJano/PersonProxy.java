package com.windystreet.AOP.aspectJano;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author windyStreet
 * @codetime 2021-04-29 17:58
 */

@Component
@Aspect
@Order(value = 1000)
public class PersonProxy {
    @Before(value = "execution(* com.windystreet.AOP.aspectJano.User.add(..))")
    public void personBefore() {
        System.out.println("person before...");
    }
}
