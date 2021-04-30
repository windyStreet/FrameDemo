package com.windystreet.template.jdbctemplate;

import com.windystreet.template.jdbctemplate.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author windyStreet
 * @codetime 2021-04-30 10:09
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplateTest.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book();
//        book.setBookId("1");
//        book.setBookName("java");
//        book.setBookStatus("1");
//        bookService.addBook(book);

//        Book book1 = new Book("2", "C", "1");
//        Book book2 = new Book("3", "C++", "0");
//        Book book3 = new Book("4", "PHP", "0");
//
//        bookService.addBook(book1);
//        bookService.addBook(book2);
//        bookService.addBook(book3);
//        Book newBook = new Book("5", "PHP", "1");
//        bookService.updateBook("4",newBook);
//        bookService.deleteBook(newBook);
//        bookService.deleteBook("1");
//        bookService.deleteBook("2");
//        bookService.deleteBook("3");
//        bookService.deleteBook("4");
        System.out.println(bookService.count());
        System.out.println(bookService.queryBookInfoByID("3"));
        System.out.println(bookService.queryAll());

//        List<Object[]> batchArgs= new ArrayList();
//        batchArgs.add(new Object[]{"6","C","1"});
//        batchArgs.add(new Object[]{"7","C++","1"});
//        batchArgs.add(new Object[]{"8","python","1"});
//        bookService.batchAddBook(batchArgs);

//        List<Object[]> batchArgs= new ArrayList();
//        batchArgs.add(new Object[]{"61","C","1","6"});
//        batchArgs.add(new Object[]{"71","C++","1","7"});
//        batchArgs.add(new Object[]{"81","python","1","8"});
//        bookService.batchUpdateBook(batchArgs);

        List<Object[]> batchArgs = new ArrayList();
        batchArgs.add(new Object[]{"61"});
        batchArgs.add(new Object[]{"71"});
        batchArgs.add(new Object[]{"81"});
        bookService.batchDeleteBook(batchArgs);
    }
}
