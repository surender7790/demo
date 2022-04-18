package com.suripie.login.service;

import java.util.Collection;

import com.suripie.login.model.Book;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}