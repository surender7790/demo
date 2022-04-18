package com.suripie.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    public Book(String isbn, String name, String author) {
    	this.author = author;
    	this.isbn = isbn;
    	this.name = name;
	}
    public Book() {
    	
    }
	private String isbn;
    private String name;
    private String author;

    //getters, setters, constructors and toString
}