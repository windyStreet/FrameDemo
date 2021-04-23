package com.windystreet.spring.ioc.facbean;

import com.windystreet.spring.ioc.collection.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author windyStreet
 * @codetime 2021-04-22 18:33
 */
public class MyBean implements FactoryBean<Course> {


    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("保险");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
