package com.windystreet.ioc.spring;

/**
 * @author windyStreet
 * @codetime 2021-04-22 14:56
 */
public class Order {
    private String orderName;
    private double price;


    public Order(String orderName, double price) {
        this.orderName = orderName;
        this.price = price;
    }
    public void orderTest(){
        System.out.println("order test-->{" + orderName + ":" + String.valueOf(price)+"}");
    }
}
