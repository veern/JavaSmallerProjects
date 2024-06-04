package BookManagementSystem;

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
        if (!this.subtitle.isEmpty()) {
            resultString.append(": ").append(this.subtitle);
        }
        if (!this.author.getFirstName().isEmpty()) {
            resultString.append(", ").append(this.author.getFirstName());
            if (!this.author.getLastName().isEmpty()) {
                resultString.append(" ").append(this.author.getLastName());
            }
        }
        if (this.yearOfPublish != -1) {
            resultString.append(", ").append(this.yearOfPublish);
        }
        return resultString.toString();
    }
}
