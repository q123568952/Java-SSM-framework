package com.morgan.springIoCandDIdemo.dao.impl;

import com.morgan.springIoCandDIdemo.dao.UserDao;

public class UserDaoImpl implements UserDao{
    public void save(){
        System.out.println("user dao save ...");
    }
    
}
