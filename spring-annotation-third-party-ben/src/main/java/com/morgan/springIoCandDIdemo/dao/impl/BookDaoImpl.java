package com.morgan.springIoCandDIdemo.dao.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.morgan.springIoCandDIdemo.dao.BookDao;


@Repository("bookDao")
public class BookDaoImpl implements BookDao{

    @Value("${name}")
    private String name;

    public void save(){
        System.out.println("book dao save ..." + name);
    }
   

    public void setName(String name) {
        this.name = name;
    }

}
