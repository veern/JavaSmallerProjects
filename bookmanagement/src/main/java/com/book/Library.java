package com.book;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

import com.book.interfaces.BookSearchCriteria;

import lombok.Getter;

@Getter
public class Library {
    
    private static final int MIN_ID = 100_000;
    private static final int MAX_ID = 999_999;

    HashMap<Integer, Book> bookShelf;
    int amountOfBooks;

    public Library(){
        this.bookShelf = new HashMap<>();
        this.amountOfBooks = 0;
    }

    private int generateRandomUniqueId() {
        Random random = new Random();
        int id;
        do {
            id = random.nextInt(MIN_ID, MAX_ID);
        } while (bookShelf.containsKey(id));
        return id;
    }
    
    public int getIdFromBook(Book book) {
        for (Entry<Integer, Book> entry : this.bookShelf.entrySet()) {
            if (Objects.equals(entry.getValue(), book)) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public void addBookToShelf(Book bookToAdd){
        this.bookShelf.put(generateRandomUniqueId(), bookToAdd);
        this.amountOfBooks++;
    }

    public void removeBookFromShelf(Book bookToRemove){
        if (this.bookShelf.remove(getIdFromBook(bookToRemove)) != null){
            this.amountOfBooks -= 1;
        }
    }

    public void printOutAllBooks() {
        for (Entry<Integer, Book> entry : this.bookShelf.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString());
        }
    }

    public HashMap<Integer, Book> getAllBooks() {
        return this.bookShelf;
    }

    public ArrayList<Book> findBookByParameter(BookSearchCriteria bookSearch) {
        ArrayList<Book> findings = new ArrayList<>();
        for (Entry<Integer, Book> entry : this.bookShelf.entrySet()) {
            if (bookSearch.search(entry.getValue())) {
                findings.add(entry.getValue());
            }
        }
        return findings;
    }

    public void writeAllToFile() {
        try {
            FileWriter writer = new FileWriter("Data.txt");
            for (Entry<Integer, Book> entry : this.bookShelf.entrySet()) {
                writer.append(entry.getValue().toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeSelectedBooksToFile(BookSearchCriteria bookSearch) {
        try {
            FileWriter writer = new FileWriter("Data.txt");
            ArrayList<Book> foundBooks = findBookByParameter(bookSearch);
            for (Book book : foundBooks) {
                writer.append(book.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
