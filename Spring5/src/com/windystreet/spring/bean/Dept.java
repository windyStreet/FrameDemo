package com.windystreet.spring.bean;

/**
 * @author windyStreet
 * @codetime 2021-04-22 16:03
 */
public class Dept {
    private String partName;


    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "partName='" + partName + '\'' +
                '}';
    }
}
