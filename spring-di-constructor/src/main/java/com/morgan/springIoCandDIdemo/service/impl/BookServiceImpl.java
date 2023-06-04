package com.morgan.springIoCandDIdemo.service.impl;
import com.morgan.springIoCandDIdemo.service.BookService;
import com.morgan.springIoCandDIdemo.dao.BookDao;
import com.morgan.springIoCandDIdemo.dao.UserDao;

public class BookServiceImpl implements BookService{

    private BookDao bookDao;
    private UserDao userDao;


    
    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }


    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }  
}
