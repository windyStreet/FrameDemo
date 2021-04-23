package com.windystreet.ioc.spring.ioc.lifecycle;

/**
 * @author windyStreet
 * @codetime 2021-04-23 10:29
 */
public class Life {
    private String type;

    public void setType(String type) {
        System.out.println("调用set，执行了注入");
        this.type = type;
    }

    public Life() {
        System.out.println("执行了无参的构造函数");
    }
    // 创建执行的初始化的方法
    public void initLife(){
        System.out.println("执行初始化方法");
    }

    public void destroyLife(){
        System.out.println("执行销毁方法");
    }
}
