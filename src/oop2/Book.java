package oop2;

public class Book {

    private String title;
    private String isbn;
    private double price;

    // Composition
    private Publisher publisher;

    // Constructor
    public Book(String title, String isbn, double price, Publisher publisher) {

        this.title = title;
        this.isbn = isbn;
        this.price = price;

        // storing Publisher object
        this.publisher = publisher;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    // Premium Book Method
    public boolean isPremiumBook() {

        return price > 5000;
    }

    // Display method
    public void display() {

        System.out.println("\n===== BOOK DETAILS =====");

        System.out.println("Title : " + title);
        System.out.println("ISBN  : " + isbn);
        System.out.println("Price : " + price);

        // calling Publisher display method
        publisher.display();

        if(isPremiumBook()) {
            System.out.println("This is a Premium Book");
        }
        else {
            System.out.println("This is NOT a Premium Book");
        }
    }
}
