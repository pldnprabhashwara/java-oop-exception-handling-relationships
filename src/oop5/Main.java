package oop5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Department input
        System.out.print("Enter Department Name: ");
        String dName = input.nextLine();

        System.out.print("Enter Department Code: ");
        String dCode = input.nextLine();

        // Create Department object
        Department dept = new Department(dName, dCode);

        // Input at least 2 professors
        for (int i = 0; i < 2; i++) {

            System.out.println("\nEnter Professor " + (i + 1) + " Details");

            System.out.print("Professor ID: ");
            String id = input.nextLine();

            System.out.print("Professor Name: ");
            String name = input.nextLine();

            System.out.print("Specialization: ");
            String spec = input.nextLine();

            // Create Professor object independently
            Professor p = new Professor(id, name, spec);

            // Add Professor to Department
            dept.addProfessor(p);
        }

        // Display all details
        dept.displayDepartment();

        input.close();
    }
}