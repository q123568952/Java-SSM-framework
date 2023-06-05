package com.morgan.springIoCandDIdemo;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.BookDao;


public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao bookDao = ctx.getBean(BookDao.class);
		System.out.println(bookDao);
	

	}

}
