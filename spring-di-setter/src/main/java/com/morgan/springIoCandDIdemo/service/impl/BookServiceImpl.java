package com.morgan.springIoCandDIdemo.service.impl;
import com.morgan.springIoCandDIdemo.service.BookService;
import com.morgan.springIoCandDIdemo.dao.BookDao;
import com.morgan.springIoCandDIdemo.dao.UserDao;

public class BookServiceImpl implements BookService{

    private BookDao bookDao;
    private UserDao userDao;

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }


    
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    
    
}
