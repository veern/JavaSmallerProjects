package com.book.interfaces;

import com.book.Author;
import com.book.Book;

public class AuthorSearch implements BookSearchCriteria {
    private final Author author;

    public AuthorSearch(Author author) {
        this.author = author;
    }

    @Override
    public boolean search(Book book) {
        return book.getAuthor().equals(author);
    }
}
