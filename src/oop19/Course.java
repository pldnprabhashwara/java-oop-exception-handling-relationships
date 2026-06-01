package oop19;

public class Course {
    protected String courseCode;
    protected String courseName;
    protected Lecturer lecturer; // Aggregation - Lecturer passed in from outside

    public Course(String courseCode, String courseName, Lecturer lecturer) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecturer = lecturer;
    }

    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Lecturer Details:");
        lecturer.displayDetails();
    }
}