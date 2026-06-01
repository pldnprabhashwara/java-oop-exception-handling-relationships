package oop19;

public class Department {
    private String departmentName;
    private String departmentCode;

    public Department(String departmentName, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public void displayDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department Code: " + departmentCode);
    }
}