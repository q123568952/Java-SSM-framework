package com.morgan.springIoCandDIdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.OrderDao;

public class AppOrder {

	public static void main(String[] args) {
		// get bean
		// OrderDao orderDao = OrderDaoFactory.getOrderDao();
		// orderDao.save();

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		// bookDao.save();
		OrderDao orderDao = (OrderDao)ctx.getBean("OrderDao");
		orderDao.save();
	}

}
