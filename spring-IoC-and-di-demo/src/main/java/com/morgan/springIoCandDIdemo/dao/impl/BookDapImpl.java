package com.morgan.springIoCandDIdemo.dao.impl;

import com.morgan.springIoCandDIdemo.dao.BookDao;

public class BookDapImpl implements BookDao{
    
    public void save(){
        System.out.println("book dao save ...");
    }
}
