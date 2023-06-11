package com.morgan.springIoCandDIdemo.dao.impl;


import org.springframework.stereotype.Repository;

import com.morgan.springIoCandDIdemo.dao.ResourcesDao;




@Repository
public class ResourcesDaoImpl implements ResourcesDao{

    @Override
    public boolean readResources(String url, String password) {
    return password.equals("root");
    }


    
   
}
