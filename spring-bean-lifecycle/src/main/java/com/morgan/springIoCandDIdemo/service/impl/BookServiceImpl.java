package com.morgan.springIoCandDIdemo.service.impl;


import com.morgan.springIoCandDIdemo.service.BookService;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.morgan.springIoCandDIdemo.dao.BookDao;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean{

    private BookDao BookDao;

    public void save(){
        System.out.println("book service save ...");
        BookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set bookdao ...");
        BookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init ...");
    }
    
}
