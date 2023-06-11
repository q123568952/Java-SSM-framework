package com.morgan.springIoCandDIdemo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.morgan.springIoCandDIdemo.config.SpringConfig;
import com.morgan.springIoCandDIdemo.service.ResourceService;



public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		ResourceService resourceService = ctx.getBean(ResourceService.class);
		boolean flag = resourceService.openURL("http://test.tteesstt.com/hihi   ", " root ");
		System.out.println(flag);
		

	}

}
