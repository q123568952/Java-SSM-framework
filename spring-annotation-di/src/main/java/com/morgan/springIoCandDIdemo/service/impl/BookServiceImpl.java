package com.morgan.springIoCandDIdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.morgan.springIoCandDIdemo.dao.BookDao;
import com.morgan.springIoCandDIdemo.service.BookService;
@Service
public class BookServiceImpl implements BookService  {

    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
    }
    
}
