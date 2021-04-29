package com.windystreet.AOP.aspectJano;

import org.springframework.stereotype.Component;

/**
 * @author windyStreet
 * @codetime 2021-04-29 17:09
 */
@Component(value = "user1")
public class User {
    public void add() {
        System.out.println("add....");
    }
}
