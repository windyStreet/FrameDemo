package com.windystreet.spring.ioc.collection;

/**
 * @author windyStreet
 * @codetime 2021-04-22 17:48
 */
public class Course {
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
