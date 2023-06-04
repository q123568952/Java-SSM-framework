package com.morgan.springIoCandDIdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.BookDao;


public class AppForDICollection {

	public static void main(String[] args) {
		// get bean
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ctx.registerShutdownHook();
		// BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		// bookDao.save();
		BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		bookDao.save();
		
		// ctx.close();
	}

}
