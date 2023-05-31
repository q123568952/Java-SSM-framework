package com.morgan.springIoCandDIdemo.service.impl;

import com.morgan.springIoCandDIdemo.dao.impl.BookDapImpl;
import com.morgan.springIoCandDIdemo.service.BookService;
import com.morgan.springIoCandDIdemo.dao.BookDao;

public class BookServiceImpl implements BookService{

    private BookDao BookDao = new BookDapImpl();

    public void save(){
        System.out.println("book service save ...");
        BookDao.save();
    }
    
}
