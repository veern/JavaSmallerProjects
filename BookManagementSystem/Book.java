package BookManagementSystem;

import java.util.Objects;

public class Book {
    
    private String title;
    private String subtitle;
    private Author author;
    private int yearOfPublish = -1;

    public Book(String title, String subtitle, Author author, int yearOfPublish) {
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    public Book(String title, Author author, int yearOfPublish) {
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    public Book(String title, String subtitle, Author author) {
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
    }

    public Book(String title, int yearOfPublish) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String toString() {
        StringBuilder resultString = new StringBuilder();
        resultString.append(this.title);
        if (this.subtitle != null) {
            resultString.append(": ").append(this.subtitle);
        }
        if (this.author.getFirstName() != null) {
            resultString.append(", ").append(this.author.getFirstName());
            if (this.author.getLastName() != null) {
                resultString.append(" ").append(this.author.getLastName());
            }
        }
        if (this.yearOfPublish != -1) {
            resultString.append(", ").append(this.yearOfPublish);
        }
        return resultString.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getTitle() != null) ? this.getTitle().hashCode() : 0);
        result = prime * result + ((this.getSubtitle() != null) ? this.getSubtitle().hashCode() : 0);
        result = prime * result
                + ((this.getAuthor().getFirstName() != null) ? this.getAuthor().getFirstName().hashCode() : 0);
        result = prime * result
                + ((this.getAuthor().getLastName() != null) ? this.getAuthor().getLastName().hashCode() : 0);
        result = prime * result + ((this.getYearOfPublish() != -1) ? this.getYearOfPublish() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return Objects.equals(this.getAuthor(), otherBook.getAuthor()) &&
            Objects.equals(this.getTitle(), otherBook.getTitle()) &&
            Objects.equals(this.getSubtitle(), otherBook.getSubtitle()) &&
            Objects.equals(this.getYearOfPublish(), otherBook.getYearOfPublish());
         
    }
}
