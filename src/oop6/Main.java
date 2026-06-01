package oop6;
import java.util.Scanner;

public class Main {

    // Dependency Injection via constructor
    private final GradeCalculator gradeCalculator;

    public Main(GradeCalculator gradeCalculator) {
        this.gradeCalculator = gradeCalculator;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks (0-100): ");
        double marks = sc.nextDouble();

        Student student = new Student(id, name, marks);

        System.out.println("\n=== Student Details ===");
        student.display();

        System.out.println("\n=== Grade Results ===");
        System.out.println("Standard Grade (via Student) : " + gradeCalculator.computeGrade(student.getMarks()));
        System.out.println("Standard Grade (raw marks)   : " + gradeCalculator.computeGrade(student.getMarks()));

        // Medical student example
        System.out.println("Medical Student Grade        : " +
                gradeCalculator.computeGrade(student.getMarks(), true));
    }

    public static void main(String[] args) {
        // Dependency Injection
        GradeCalculator calculator = new GradeCalculator();
        Main app = new Main(calculator);
        app.run();
    }
}