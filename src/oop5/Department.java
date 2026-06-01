package oop5;

// Department class
class Department {

    private String deptName;
    private String deptCode;

    // Array of Professor objects
    private Professor[] professors = new Professor[5];

    // To track added professors
    private int count = 0;

    // Constructor
    public Department(String deptName, String deptCode) {
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    // Method to add professor
    public void addProfessor(Professor p) {

        if (count < professors.length) {
            professors[count] = p;
            count++;
        }
        else {
            System.out.println("Professor array is full!");
        }
    }

    // STEM check method
    public boolean isStemDepartment() {

        return deptCode.startsWith("SCI") ||
                deptCode.startsWith("ENG");
    }

    // Display Department details
    public void displayDepartment() {

        System.out.println("\nDepartment Name : " + deptName);
        System.out.println("Department Code : " + deptCode);

        System.out.println("\nProfessor Details");

        for (int i = 0; i < count; i++) {

            System.out.println("\nProfessor " + (i + 1));

            professors[i].display();
        }

        // STEM result
        if (isStemDepartment()) {
            System.out.println("\nThis is a STEM Department");
        }
        else {
            System.out.println("\nThis is NOT a STEM Department");
        }
    }
}