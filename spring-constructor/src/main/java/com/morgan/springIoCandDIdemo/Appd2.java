package com.morgan.springIoCandDIdemo;

import com.morgan.springIoCandDIdemo.service.BookService;
import com.morgan.springIoCandDIdemo.service.impl.BookServiceImpl;

public class Appd2 {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		bookService.save();
	}

}
