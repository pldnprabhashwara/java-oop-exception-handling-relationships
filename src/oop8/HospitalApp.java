package oop8;

// HospitalApp.java
public class HospitalApp {

    public static void main(String[] args) {

        // Object using default constructor
        Patient patient1 = new Patient();

        // Setting values using setters
        patient1.setPatientId(101);
        patient1.setName("Nimal");
        patient1.setAge(30);
        patient1.setDisease("Fever");

        // Object using parameterized constructor
        Patient patient2 = new Patient(102, "Kasun", 45, "Diabetes");

        // Calling overloaded methods
        patient1.bookAppointment("Perera");
        patient2.bookAppointment("Silva", "25 May 2026");

        // Display patient details
        patient1.printPatientDetails();
        patient2.printPatientDetails();
    }
}
