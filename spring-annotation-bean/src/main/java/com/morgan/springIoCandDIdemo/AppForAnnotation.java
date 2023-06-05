package com.morgan.springIoCandDIdemo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.dao.BookDao;
import com.morgan.springIoCandDIdemo.service.BookService;


public class AppForAnnotation {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		System.out.println(bookDao);
		BookService bookService = ctx.getBean(BookService.class);
		System.out.println(bookService);
	}

}
