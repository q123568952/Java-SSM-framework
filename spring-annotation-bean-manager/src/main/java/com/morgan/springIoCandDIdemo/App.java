package com.morgan.springIoCandDIdemo;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.BookDao;
import com.morgan.springIoCandDIdemo.service.BookService;


public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		System.out.println(bookDao);
		BookService bookService = ctx.getBean(BookService.class);
		System.out.println(bookService);

	}

}
