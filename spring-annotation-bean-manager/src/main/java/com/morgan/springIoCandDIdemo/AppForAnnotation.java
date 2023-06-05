package com.morgan.springIoCandDIdemo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.dao.BookDao;
import com.morgan.springIoCandDIdemo.service.BookService;


public class AppForAnnotation {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		BookDao bookDao1 = ctx.getBean(BookDao.class);
		BookDao bookDao2 = ctx.getBean(BookDao.class);
		System.out.println(bookDao1);
		System.out.println(bookDao2);
	}

}
