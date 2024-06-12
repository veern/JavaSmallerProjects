package com.book;

import com.book.interfaces.AuthorSearch;
import com.book.interfaces.TitleSearch;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book book1 = new Book("Wiedzmin", "Wild Hunt", new Author("Andrzej", "Sapkowski"));
        Book book2 = new Book("Wiedzmin", "Wild Hunt", new Author("Andrzej", "Sapkowski"));
        System.out.println(book1.equals(book2));
        myLibrary.addBookToShelf(book1);
        myLibrary.addBookToShelf(book1);
        myLibrary.addBookToShelf(book2);

        AuthorSearch authorSearch = new AuthorSearch(new Author("Andrzej", "Lapkowski"));
        TitleSearch titleSearch = new TitleSearch("Wiedzmin");

        System.out.println(myLibrary.findBookByParameter(authorSearch));
        myLibrary.printOutAllBooks();
        // myLibrary.writeAllToFile();
        myLibrary.writeSelectedBooksToFile(titleSearch);
    }
}
