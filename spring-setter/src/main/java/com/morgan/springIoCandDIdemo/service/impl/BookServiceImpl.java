package com.morgan.springIoCandDIdemo.service.impl;


import com.morgan.springIoCandDIdemo.service.BookService;


import com.morgan.springIoCandDIdemo.dao.BookDao;

public class BookServiceImpl implements BookService{

    private BookDao BookDao;
    private UserDao UserDao;

    public void save(){
        System.out.println("book service save ...");
        BookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set bookdao ...");
        BookDao = bookDao;
    }

    
    
}
