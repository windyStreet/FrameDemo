package com.windystreet.template.jdbctemplate.dao;

import com.windystreet.template.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author windyStreet
 * @codetime 2021-04-30 10:22
 */
@Repository
public class BookDaoImpl implements BookDao {
    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getBookId(), book.getBookName(), book.getBookStatus()};
        int update_res = jdbcTemplate.update(sql, args);
        System.out.println(update_res);
    }

    @Override
    public void update(String id, Book book) {
        String sql = "update  t_book  set bookId = ?, bookName = ?, bookStatus = ? where bookId = ?";
        Object[] args = {book.getBookId(), book.getBookName(), book.getBookStatus(), id};
        int update_res = jdbcTemplate.update(sql, args);
        System.out.println(update_res);

    }

    @Override
    public void update(Book oldBook, Book newBook) {
        String id = oldBook.getBookId();
        update(id, newBook);
    }

    @Override
    public void delete(Book book) {
        delete(book.getBookId());
    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where bookId = ?";
        int update_res = jdbcTemplate.update(sql, id);
        System.out.println(update_res);

    }

    @Override
    public int count() {
        String sql = "select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Object query(String id) {
        String sql = "select * from t_book where bookId = ?";
        Object[] args = {id};
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), args);
    }

    @Override
    public List queryAll() {
        String sql = "select * from t_book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update  t_book  set bookId = ?, bookName = ?, bookStatus = ? where bookId = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where bookId = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }
}
