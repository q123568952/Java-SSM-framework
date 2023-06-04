package com.morgan.springIoCandDIdemo.dao.impl;

import com.morgan.springIoCandDIdemo.dao.BookDao;

public class BookDaoImpl implements BookDao{

    private int connectionNum;
    private String databaseName;

    
    
    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }



    public void save(){
        System.out.println("book dao save ..." + databaseName +"," + connectionNum);
    }

}
