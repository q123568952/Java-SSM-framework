package com.morgan.springIoCandDIdemo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.service.BookService;


public class AppForAnnotation {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		BookService bookService = ctx.getBean(BookService.class);
		bookService.save();
	

	}

}
