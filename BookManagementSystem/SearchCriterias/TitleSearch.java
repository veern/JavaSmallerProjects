package BookManagementSystem.SearchCriterias;

import BookManagementSystem.Book;
import BookManagementSystem.Interfaces.BookSearchCriteria;

public class TitleSearch implements BookSearchCriteria {
    private final String title;
    
    public TitleSearch(String title) {
        this.title = title;
    }

    @Override
    public boolean search(Book book) {
        return book.getTitle().equals(this.title);
    }
}
