package com.suripie.login.exception;

import com.suripie.login.model.Book;

public class DuplicateBookException extends RuntimeException {
    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }

    // getter methods
}