package com.book;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book = new Book("Test", new Author("Doe"), 1999);
        lib.addBookToShelf(book);
        lib.getIdFromBook(book);
        lib.printOutAllBooks();  
    }
}
