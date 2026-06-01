package oop2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====== Library Management System ======");

        // Book Inputs
        System.out.print("Enter Book Title: ");
        String title = input.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = input.nextLine();

        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        input.nextLine();

        // Publisher Inputs
        System.out.print("Enter Publisher Name: ");
        String publisherName = input.nextLine();

        System.out.print("Enter Publisher Country: ");
        String country = input.nextLine();

        // Create Publisher object
        Publisher publisher = new Publisher(publisherName, country);

        // Create Book object
        Book book = new Book(title, isbn, price, publisher);

        // Display Details
        book.display();
    }
}
