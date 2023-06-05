package com.morgan.springIoCandDIdemo;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.BookDao;


public class App {

	public static void main(String[] args) {
		// get bean
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);
		BookDao bookDao =(BookDao) ctx.getBean("bookDao");
		bookDao.save();

	}

}
