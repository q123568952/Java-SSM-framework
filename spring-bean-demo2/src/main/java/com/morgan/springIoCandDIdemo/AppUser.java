package com.morgan.springIoCandDIdemo;
import com.morgan.springIoCandDIdemo.dao.UserDao;
import com.morgan.springIoCandDIdemo.factory.UserDaoFactory;

public class AppUser {

	public static void main(String[] args) {
		// get bean
		// OrderDao orderDao = OrderDaoFactory.getOrderDao();
		// orderDao.save();
	UserDaoFactory userDaoFactory = new UserDaoFactory();
	UserDao userDao = userDaoFactory.getUserDao();
	userDao.save();
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// // BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		// // bookDao.save();
		// OrderDao orderDao = (OrderDao)ctx.getBean("OrderDao");
		// orderDao.save();
	}

}
