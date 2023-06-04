package com.morgan.springIoCandDIdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// get bean
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}

}
