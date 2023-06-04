package com.morgan.springIoCandDIdemo.service.impl;
import com.morgan.springIoCandDIdemo.service.BookService;
import com.morgan.springIoCandDIdemo.dao.BookDao;


public class BookServiceImpl implements BookService{

    private BookDao bookDao;
    

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
     
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }  
}
