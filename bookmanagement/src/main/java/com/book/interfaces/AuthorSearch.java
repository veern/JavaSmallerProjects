package com.book.interfaces;

import com.book.Author;
import com.book.Book;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorSearch implements BookSearchCriteria {
    private final Author author;

    @Override
    public boolean search(Book book) {
        return book.getAuthor().equals(author);
    }
}
