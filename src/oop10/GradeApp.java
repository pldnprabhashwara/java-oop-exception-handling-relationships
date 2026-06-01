package oop10;
import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Student ID: ");
        int id = input.nextInt();

        System.out.println("Enter the Student Marks: ");
        double marks = input.nextDouble();

        GradeEntry entry = new GradeEntry();

        try {
            try {
                if (id <= 0) {
                    throw new InvalidStudentIdException("Student ID must be positive.");
                }
            } catch (InvalidStudentIdException e) {
                System.out.println("ID Error: " + e.getMessage());
            }

            entry.validateEntry(id, marks);
            System.out.println("Entry recorded successfully.");

        } catch (InvalidMarksException e) {
            System.out.println("Marks Error: " + e.getMessage());
        } catch (InvalidStudentIdException e) {
            System.out.println("ID Error: " + e.getMessage());
        }
    }
}
