package BookManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book book1 = new Book("Wiedzmin", "Wild Hunt", new Author("Andrzej", "Sapkowski"));
        Book book2 = new Book("Wiedzminy", "Wild Hunt", new Author("Andrzej", "Sapkowski"));

        myLibrary.addBookToShelf(book1);
        myLibrary.addBookToShelf(book1);
        myLibrary.addBookToShelf(book2);
        System.out.println(myLibrary.findBookByParameter("Wiedzmin"));
        myLibrary.printOutAllBooks();
        // myLibrary.removeBookFromShelf(book1);
        // myLibrary.printOutAllBooks();
        // System.out.println(myLibrary.getAmountOfBooks());


    }
}
