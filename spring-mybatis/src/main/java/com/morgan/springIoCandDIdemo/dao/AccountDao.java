package com.morgan.springIoCandDIdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.morgan.springIoCandDIdemo.demain.Account;

public interface AccountDao {

    @Insert("insert into tb1_account(name,money) value (#{name},#{money})")
    void save(Account account);

    @Update("update tb1_account set name = #{name}, #{money} where id = #{id}")
    void update(Account account);

    @Delete("delete from tb1_account where id = #{id}")
    void delete(Integer id);

    @Select("select *from tb1_account where id = #{id}")
    Account findById(Integer id);
    
    @Select("select *from tb1_account")
    List<Account> findAll();
}
