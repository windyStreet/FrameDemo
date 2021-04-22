package com.windystreet.spring.ioc.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author windyStreet
 * @codetime 2021-04-22 16:35
 */
public class Student {

    private String[] courses;
    private List<String> list;
    private Map<String, String> maps;
//    private Set<String> sets;
    private Set<Double> sets;
    // 学生所学的多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Student(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }
}
