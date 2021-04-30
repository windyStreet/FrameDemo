package com.windystreet.template.jdbctemplate.service;

import com.windystreet.template.jdbctemplate.dao.BookDao;
import com.windystreet.template.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author windyStreet
 * @codetime 2021-04-30 10:23
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    // 添加
    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book oldBook, Book newBook) {
        bookDao.update(oldBook, newBook);
    }

    public void updateBook(String id, Book book) {
        bookDao.update(id, book);
    }

    public void deleteBook(String id) {
        bookDao.delete(id);
    }

    public void deleteBook(Book book) {
        bookDao.delete(book);
    }

    public int count() {
        return bookDao.count();
    }

    public Book queryBookInfoByID(String id) {
        return (Book) bookDao.query(id);
    }

    public List<Book> queryAll() {
        List list = bookDao.queryAll();
        return list;
    }

    public void batchAddBook(List<Object[]> bathArgs) {
        bookDao.batchAdd(bathArgs);
    }
    public void batchUpdateBook(List<Object[]> bathArgs) {
        bookDao.batchUpdate(bathArgs);
    }
    public void batchDeleteBook(List<Object[]> bathArgs) {
        bookDao.batchDelete(bathArgs);
    }


}
