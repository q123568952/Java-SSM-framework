package com.morgan.springIoCandDIdemo.service.impl;

import org.springframework.stereotype.Service;

import com.morgan.springIoCandDIdemo.domain.User;
import com.morgan.springIoCandDIdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    public void save(User user) { System.out.println("user service ...");
        
    }
}
