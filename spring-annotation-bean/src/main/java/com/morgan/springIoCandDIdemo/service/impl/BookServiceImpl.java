package com.morgan.springIoCandDIdemo.service.impl;

import org.springframework.stereotype.Component;

import com.morgan.springIoCandDIdemo.dao.BookDao;
import com.morgan.springIoCandDIdemo.service.BookService;
@Component
public class BookServiceImpl implements BookService  {
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
    }
    
    
}
