package BookManagementSystem.SearchCriterias;

import BookManagementSystem.Book;
import BookManagementSystem.Interfaces.BookSearchCriteria;

public class YearOfPublishSearch implements BookSearchCriteria {
    private final int yearOfPublish;

    public YearOfPublishSearch(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    @Override
    public boolean search(Book book) {
        return book.getYearOfPublish() == yearOfPublish;
    }
}
