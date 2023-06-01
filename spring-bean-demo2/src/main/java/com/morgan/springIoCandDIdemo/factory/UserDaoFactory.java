package com.morgan.springIoCandDIdemo.factory;
import com.morgan.springIoCandDIdemo.dao.UserDao;
import com.morgan.springIoCandDIdemo.dao.impl.UserDaoImpl;

public class UserDaoFactory{

	public UserDao getUserDao(){
		System.out.println("factory setup ...");
		return new UserDaoImpl();
	}
	}