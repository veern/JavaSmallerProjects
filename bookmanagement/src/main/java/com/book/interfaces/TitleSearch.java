package com.book.interfaces;

import com.book.Book;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TitleSearch implements BookSearchCriteria {
    private final String title;
    
    @Override
    public boolean search(Book book) {
        return book.getTitle().equals(this.title);
    }
}
