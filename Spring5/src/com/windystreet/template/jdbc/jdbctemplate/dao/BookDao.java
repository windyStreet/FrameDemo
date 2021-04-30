package com.windystreet.template.jdbc.jdbctemplate.dao;

import com.windystreet.template.jdbc.jdbctemplate.entity.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author windyStreet
 * @codetime 2021-04-30 10:21
 */
public interface  BookDao {
    void add(Book book);
    void update(String id ,Book book);
    void update(Book oldBook ,Book newBook);
    void delete(Book book);
    void delete(String id);
    int count();
    Object query(String id);
}
