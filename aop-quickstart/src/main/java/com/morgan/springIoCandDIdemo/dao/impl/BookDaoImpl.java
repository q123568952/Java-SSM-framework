package com.morgan.springIoCandDIdemo.dao.impl;


import org.springframework.stereotype.Repository;

import com.morgan.springIoCandDIdemo.dao.BookDao;


@Repository
public class BookDaoImpl implements BookDao{


    public void update(){
       
        System.out.println("book dao update ...");
    }
     public int select(){
        System.out.println("book dao select ...");
        return 100;
    }
     
   
}
