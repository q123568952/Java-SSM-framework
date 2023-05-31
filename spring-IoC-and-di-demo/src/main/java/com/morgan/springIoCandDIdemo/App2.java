package com.morgan.springIoCandDIdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.BookDao;

public class App2 {

	public static void main(String[] args) {
		// get bean
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		bookDao.save();
	}

}
