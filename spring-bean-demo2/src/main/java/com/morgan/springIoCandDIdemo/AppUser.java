package com.morgan.springIoCandDIdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.UserDao;

public class AppUser {

	public static void main(String[] args) {
		// get bean
		// OrderDao orderDao = OrderDaoFactory.getOrderDao();
		// orderDao.save();
	// UserDaoFactory userDaoFactory = new UserDaoFactory();
	// UserDao userDao = userDaoFactory.getUserDao();
	// userDao.save();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao)ctx.getBean("userDao");
		userDao.save();
		
	}

}
