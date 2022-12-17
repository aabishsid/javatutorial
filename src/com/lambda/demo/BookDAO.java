package com.lambda.demo;

import java.util.ArrayList;
import java.util.List;


public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(101, "Hibernate", 180));
		books.add(new Book(101, "Spring", 200));
		books.add(new Book(101, "WebServive", 300));
		return books;
	}
}
 