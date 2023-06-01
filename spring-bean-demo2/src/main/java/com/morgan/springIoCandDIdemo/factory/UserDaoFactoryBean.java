package com.morgan.springIoCandDIdemo.factory;

import org.springframework.beans.factory.FactoryBean;


import com.morgan.springIoCandDIdemo.dao.UserDao;
import com.morgan.springIoCandDIdemo.dao.impl.UserDaoImpl;

public class UserDaoFactoryBean implements FactoryBean<UserDao>{

    public UserDao getObject() throws Exception {
    return new UserDaoImpl();
    }


    public Class<?> getObjectType() {
        return UserDao.class;
    }
    
}
