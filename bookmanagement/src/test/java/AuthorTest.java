import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.book.Author;

public class AuthorTest {

    private final String FIRST_NAME_1 = "Jan";
    private final String FIRST_NAME_2 = "Debby";
    private final String LAST_NAME_1 = "Kowalski";
    private final String LAST_NAME_2 = "Smith";

    @Test
    public void testEqualsNotAllArgsConstructor() {
        Author author = new Author(LAST_NAME_1);
        assertTrue(author.equals(author));
    }

    @Test
    public void testEqualsSameObject() {
        Author author = new Author(FIRST_NAME_1, LAST_NAME_1);
        assertTrue(author.equals(author));
    }

    @Test
    public void testSameFirstSameLastNameDifferentAuthors() {
        Author firstAuthor = new Author(FIRST_NAME_1, LAST_NAME_1);
        Author secondAuthor = new Author(FIRST_NAME_1, LAST_NAME_1);
        assertTrue(firstAuthor.equals(secondAuthor));
    }

    @Test
    public void testSameFirstDifferentLastName() {
        Author firstAuthor = new Author(FIRST_NAME_1, LAST_NAME_1);
        Author secondAuthor = new Author(FIRST_NAME_1, LAST_NAME_2);
        assertFalse(firstAuthor.equals(secondAuthor));
    }        

    @Test
    public void testDifferentFirstSameLastName() {
        Author firstAuthor = new Author(FIRST_NAME_1, LAST_NAME_1);
        Author secondAuthor = new Author(FIRST_NAME_2, LAST_NAME_1);
        assertFalse(firstAuthor.equals(secondAuthor));
    }

    @Test
    public void testCompareAuthorToNotAuthor() {
        Author author = new Author(FIRST_NAME_1, LAST_NAME_1);
        String notAuthor = "NotAuthor";
        assertFalse(author.equals(notAuthor));
    }

    @Test
    public void testEqualsNullObject() {
        Author author = new Author();
        assertFalse(author.equals(null));
    }

    @Test
    public void testSetFirstNameGetFullFirstName() {
        Author author = new Author(FIRST_NAME_1, LAST_NAME_1);
        author.setFirstName(FIRST_NAME_2);
        assertEquals(author.getFirstName(), FIRST_NAME_2);
    }

    @Test
    public void testSetLastNameGetLastName() {
        Author author = new Author(FIRST_NAME_1, LAST_NAME_1);
        author.setLastName(LAST_NAME_2);
        assertEquals(author.getLastName(), LAST_NAME_2);
    }

    @Test
    public void testHashCodeFromTwoAuthorWithSameName() {
        Author firstAuthor = new Author(FIRST_NAME_1, LAST_NAME_1);
        Author secondAuthor = new Author(FIRST_NAME_1, LAST_NAME_1);
        int hashCode1 = firstAuthor.hashCode();
        int hashCode2 = secondAuthor.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeFromTwoAuthorsOneFromEmptyConstructor() {
        Author firstAuthor = new Author(FIRST_NAME_1, LAST_NAME_1);
        Author secondAuthor = new Author();
        int hashCode1 = firstAuthor.hashCode();
        int hashCode2 = secondAuthor.hashCode();
        assertNotEquals(hashCode1, hashCode2);
    }
}