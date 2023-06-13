package com.morgan.springIoCandDIdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morgan.springIoCandDIdemo.dao.LogDao;
import com.morgan.springIoCandDIdemo.service.LogService;

@Service
public class LogServiceImpl implements LogService{
    @Autowired
    private LogDao logDao;

    @Override
    public void log(String out, String in, Double money) {
     logDao.log("轉帳操作"+ out +"到" + in + ",金額: "+ money);
    }
    
}
