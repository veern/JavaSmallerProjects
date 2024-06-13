package com.book;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Swiat wedlug kiepskich", new Author("Ferdek", "Kiepski"));
        library.addBookToShelf(book1);
        HashMap<Integer, Book> listOfBooks = library.getAllBooks();

        for (Entry <Integer, Book> entry : listOfBooks.entrySet()) {
            System.out.println("Id: " + entry.getKey() + ", Book Title: " + entry.getValue());
        }

    }
}
