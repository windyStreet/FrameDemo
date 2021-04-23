package com.windystreet.ioc.spring;

/**
 * @author windyStreet
 * @codetime 2021-04-22 14:32
 */
public class Book {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }
    private String name;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    // set 注入
    public void setName(String name) {
        this.name = name;
    }

    // 有参注入
    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void readBook(){
        System.out.println(this.toString());
    }
}
