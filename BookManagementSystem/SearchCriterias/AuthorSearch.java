package BookManagementSystem.SearchCriterias;

import BookManagementSystem.Author;
import BookManagementSystem.Book;
import BookManagementSystem.Interfaces.BookSearchCriteria;

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
