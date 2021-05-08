package com.windystreet.springreactor;

import java.util.Observable;

/**
 * @author windyStreet
 * @codetime 2021-05-08 15:33
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        observer.addObserver((o,arg)->{
            System.out.println("发生了变化");
//            System.out.println(args);
        });
        observer.addObserver((o,arg)->{
            System.out.println("收到观察者消息，准备变化");
//            System.out.println(args);
        });
        observer.setChanged(); // 数据变化
        observer.notifyObservers(); // 通知
    }
}
