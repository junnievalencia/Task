class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + String.format("%.2f", price);
    }
}

public class Sam {
    public static void main(String[] args) {
        Book firstBook = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book secondBook = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book thirdBook = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:\n" + firstBook + "\n");
        System.out.println("Book 2:\n" + secondBook + "\n");
        System.out.println("Book 3:\n" + thirdBook + "\n");
    }
}
