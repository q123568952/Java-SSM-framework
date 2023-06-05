package com.morgan.springIoCandDIdemo.dao.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.morgan.springIoCandDIdemo.dao.BookDao;


@Repository
@Scope
public class BookDaoImpl implements BookDao{

    private String name;

    public void save(){
        System.out.println("book dao save ..." + name);
    }
   
    @PostConstruct
    public void init(){
        System.out.println("init book dao save ..." + name);
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy book dao save ..." + name);
    }
    public void setName(String name) {
        this.name = name;
    }

}
