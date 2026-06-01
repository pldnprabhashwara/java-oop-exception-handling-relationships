package oop6;

public class Student {
    private String studentID;
    private String name;
    private double marks;

    Student(String studentID, String name, double marks) {
        this.studentID = studentID;
        this.name = name;
        setMarks(marks);
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Setting to 0.");
            this.marks = 0;
        } else {
            this.marks = marks;
        }
    }

    public void display() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks);
    }

}
