package oop19;

public class UniversityApp {
    public static void main(String[] args) {

        // 1. Create University (Department created inside via Composition)
        University university = new University("SLIIT", "Information Technology", "IT101");

        // 2. Create Lecturer and assign to a Course (Aggregation)
        Lecturer lecturer = new Lecturer("Dr. Silva", "L1001");
        Course course = new Course("CS101", "Programming Fundamentals", lecturer);

        // 3. Create OnlineCourse with same Lecturer
        OnlineCourse onlineCourse = new OnlineCourse("AI201", "Introduction to AI", lecturer, "https://learn.sliit.lk");

        // 4. Display all details
        System.out.println("===== UNIVERSITY DETAILS =====");
        university.displayDetails();

        System.out.println("\n===== COURSE DETAILS =====");
        course.displayCourseInfo();

        System.out.println("\n===== ONLINE COURSE DETAILS =====");
        onlineCourse.displayCourseInfo();
    }
}
