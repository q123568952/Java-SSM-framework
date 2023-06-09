package com.morgan.springIoCandDIdemo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.dao.BookDao;


public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		BookDao bookDao = ctx.getBean(BookDao.class);
		bookDao.delete();
		
		

	}

}
