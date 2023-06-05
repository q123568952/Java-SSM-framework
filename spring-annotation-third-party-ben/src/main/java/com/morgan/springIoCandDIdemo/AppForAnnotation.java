package com.morgan.springIoCandDIdemo;



import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.service.BookService;


public class AppForAnnotation {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		DataSource dataSource= ctx.getBean(DataSource.class);
		System.out.println(dataSource);

	

	}

}
