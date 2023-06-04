package com.morgan.springIoCandDIdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppForDIConstructor {

	public static void main(String[] args) {
		// get bean
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ctx.registerShutdownHook();
		// BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		// bookDao.save();
		BookService bookService = (BookService)ctx.getBean("bookService");
		bookService.save();
		
		// ctx.close();
	}

}
