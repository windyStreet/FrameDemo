package com.windystreet.template.jdbctemplate.dao;

import com.windystreet.template.jdbctemplate.entity.Book;

import java.util.List;

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
    List queryAll();
    void batchAdd(List<Object[]> batchArgs);
    void batchUpdate(List<Object[]> batchArgs);
    void batchDelete(List<Object[]> batchArgs);
}
