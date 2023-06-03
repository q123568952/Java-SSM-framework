package com.morgan.springIoCandDIdemo.dao.impl;

import com.morgan.springIoCandDIdemo.dao.BookDao;

public class BookDaoImpl implements BookDao{
    
    public void save(){
        System.out.println("book dao save ...");
    }
    public void init(){
        System.out.println("init ...");
    }
    public void destroy(){
        System.out.println("destroy ...");
    }
}
