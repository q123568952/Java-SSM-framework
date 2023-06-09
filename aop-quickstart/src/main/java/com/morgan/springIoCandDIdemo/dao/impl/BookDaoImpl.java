package com.morgan.springIoCandDIdemo.dao.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.morgan.springIoCandDIdemo.dao.BookDao;


@Repository
public class BookDaoImpl implements BookDao{


    public void save(){
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }
     public void update(){System.out.println("book dao update ...");}
     
   
}
