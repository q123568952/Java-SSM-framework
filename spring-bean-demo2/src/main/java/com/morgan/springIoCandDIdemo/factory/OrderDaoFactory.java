package com.morgan.springIoCandDIdemo.factory;

import com.morgan.springIoCandDIdemo.dao.OrderDao;
import com.morgan.springIoCandDIdemo.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {

	public static OrderDao getOrderDao(){
		System.out.println("factory setup ...");
		return new OrderDaoImpl();
	}
	}
