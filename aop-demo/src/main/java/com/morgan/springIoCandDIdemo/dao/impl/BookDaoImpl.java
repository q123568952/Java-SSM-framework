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

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.println("book dao save ...");
        }
        long endTime = System.currentTimeMillis();
        Long totalTime =endTime-startTime;
    
        System.out.println("This cycle takes "+ totalTime +"ms");
    }
     public void update(){System.out.println("book dao update ...");}
     public void delete(){System.out.println("book dao delete ...");}
     public void select(){System.out.println("book dao select ...");}
   
}
