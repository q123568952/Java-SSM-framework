package com.morgan.springIoCandDIdemo.dao;

import org.apache.ibatis.annotations.Insert;

import com.morgan.springIoCandDIdemo.domain.User;

public interface UserDao {
    @Insert("insert into user(name,age) values(#{name}, #{age})")
    public void save( User user);
}
