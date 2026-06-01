package oop19;

public class Lecturer {
    private String name;
    private String employeeId;

    public Lecturer(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Lecturer Name: " + name);
        System.out.println("Employee ID:   " + employeeId);
    }
}
