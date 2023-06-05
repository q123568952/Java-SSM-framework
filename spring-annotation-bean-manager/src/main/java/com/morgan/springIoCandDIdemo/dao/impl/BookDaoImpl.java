package com.morgan.springIoCandDIdemo.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.morgan.springIoCandDIdemo.dao.BookDao;


@Repository
@Scope("prototype")
public class BookDaoImpl implements BookDao{

    private String name;

    public void save(){
        System.out.println("book dao save ..." + name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
