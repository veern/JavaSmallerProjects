import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.book.Author;
import com.book.Book;
import com.book.Library;

public class LibraryTest {
    

    @Test
    public void testDefaultConstructor() {
        Library lib = new Library();
        assertEquals(lib.getBookShelf(), new HashMap<Integer, Book>());
        assertEquals(lib.getAmountOfBooks(), 0);
    }

    @Test
    public void testPrintOutAllBooksNoBooks() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Library lib = new Library();
        lib.printOutAllBooks();
        String output = baos.toString().trim();
        String correctOutput = "";
        assertEquals(output, correctOutput);
    }
    
    @Test
    public void testPrintOutAllBooksOneBook() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Library lib = new Library();
        Book book = new Book("Test", new Author("Doe"), 1999);
        lib.addBookToShelf(book);
        lib.printOutAllBooks();
        String output = baos.toString().trim();
        String correctOutput = lib.getIdFromBook(book) + " - " + book.getTitle() + ", " + book.getYearOfPublish();
        assertEquals(output, correctOutput);
    }

}
