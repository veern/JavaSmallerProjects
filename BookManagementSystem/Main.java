package BookManagementSystem;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Wiedzmin", "Wild Hunt", new Author("Andrzej", "Sapkowski"));
        System.out.println(book1);
    }
}
