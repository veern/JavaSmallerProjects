import com.book.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.book.Author;

public class BookTest {

    private String title;
    private String subtitle;
    private Author author;
    private int yearOfPublish = -1;

    public BookTest() {
        this.title = "Test";
        this.subtitle = "SubTest";
        this.author = new Author("FirstName", "LastName");
        this.yearOfPublish = 1999;
    }

    @Test
    public void testDefaultConstructor() {
        Book book = new Book();
        assertNull(book.getTitle());
        assertNull(book.getSubtitle());
        assertNull(book.getAuthor());
        assertEquals(-1, book.getYearOfPublish());
    }

    @Test
    public void testAllArgsConstructor() {
        Book book = new Book(this.title, this.subtitle, this.author, this.yearOfPublish);
        assertEquals(book.getAuthor(), this.author);
        assertEquals(book.getTitle(), this.title);
        assertEquals(book.getSubtitle(), this.subtitle);
        assertEquals(book.getYearOfPublish(), this.yearOfPublish);
    }

    @Test
    public void testToStringAllArgs() {
        Book book = new Book(this.title, this.subtitle, this.author, this.yearOfPublish);
        String correctBookToString = this.title + ": " + this.subtitle + ", " + this.author.getFirstName() + " "
                + this.author.getLastName() + ", " + this.yearOfPublish;
        assertEquals(correctBookToString, book.toString());
    }
}
