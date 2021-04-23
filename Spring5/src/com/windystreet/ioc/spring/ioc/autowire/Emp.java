package com.windystreet.ioc.spring.ioc.autowire;

/**
 * @author windyStreet
 * @codetime 2021-04-23 10:58
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println("emp test()");
    }
}
