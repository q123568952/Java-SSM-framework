package com.morgan.springIoCandDIdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morgan.springIoCandDIdemo.dao.ResourcesDao;
import com.morgan.springIoCandDIdemo.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService{

    @Autowired
    private ResourcesDao resourcesDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
    
}
