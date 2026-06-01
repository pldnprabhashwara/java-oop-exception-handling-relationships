package oop19;

public class OnlineCourse extends Course {
    private String platformUrl;

    public OnlineCourse(String courseCode, String courseName, Lecturer lecturer, String platformUrl) {
        super(courseCode, courseName, lecturer);
        this.platformUrl = platformUrl;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // call parent method
        System.out.println("Platform URL: " + platformUrl);
    }
}
