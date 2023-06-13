package com.morgan.springIoCandDIdemo.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {

    @Insert("insert into log (info, createDate) value (#{info}, now()) ")
    void log(String info);
    
}
