package com.book.interfaces;

import com.book.Book;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class YearOfPublishSearch implements BookSearchCriteria {
    private final int yearOfPublish;

    @Override
    public boolean search(Book book) {
        return book.getYearOfPublish() == yearOfPublish;
    }
}
