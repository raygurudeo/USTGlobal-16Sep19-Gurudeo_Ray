package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BookConfiguration;
import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class BookApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfiguration.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPetName());
		System.out.println(book.getPrice());
	}

}
