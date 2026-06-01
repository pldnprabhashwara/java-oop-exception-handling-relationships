package oop19;

public class University {
    private String universityName;
    private Department department; // Composition

    public University(String universityName, String departmentName, String departmentCode) {
        this.universityName = universityName;
        this.department = new Department(departmentName, departmentCode); // created inside
    }

    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        department.displayDetails();
    }
}
