package com.suripie.login.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.suripie.login.exception.DuplicateBookException;
import com.suripie.login.model.Book;
import com.suripie.login.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	Book book1 = new Book("123","Oho","Me");
	Book book2 = new Book("1234","Oh4o","Me2");
	Book book3 = new Book("1232","Oho2","Me1");
	
	
	
	// constructors, other override methods
	@Override
	public Book addBook(Book book) {
		return book;
	}
	
	@Override
	public Collection<Book> getBooks(){
		Collection<Book> list = new LinkedList<Book>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		return list;
	}

	// conversion logic
}
