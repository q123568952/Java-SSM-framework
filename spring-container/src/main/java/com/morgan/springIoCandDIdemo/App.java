package com.morgan.springIoCandDIdemo;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.morgan.springIoCandDIdemo.dao.BookDao;


public class App {

	public static void main(String[] args) {
		// get bean
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("D:/springlearning/Java-SSM-framework/spring-container/src/main/resources/applicationContext.xml");
		BookDao bookDao =(BookDao) ctx.getBean("bookDao");
		bookDao.save();

	}

}
