package com.morgan.springIoCandDIdemo.dao.impl;

import com.morgan.springIoCandDIdemo.dao.BookDao;

public class BookDaoImpl implements BookDao{

    private String name;

    public void save(){
        System.out.println("book dao save ..." + name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
