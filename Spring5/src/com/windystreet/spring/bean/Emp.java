package com.windystreet.spring.bean;

/**
 * @author windyStreet
 * @codetime 2021-04-22 16:04
 */
public class Emp {
    private String name;
    private int gender;

    public Dept getDept() {
        return dept;
    }

    private Dept dept;  // 所属部门

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void showDepart() {
        System.out.println("员工展示部门:" + this.dept.toString());
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dept=" + dept +
                '}';
    }
}
