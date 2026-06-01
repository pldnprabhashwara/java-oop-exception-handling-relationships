package oop8;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String disease;

    Patient(){
        patientId = 0;
        name = "Unknown";
        age = 0;
        disease = "None";
    }

    Patient(int patientId, String name, int age, String disease){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public int getPatientId(){
        return patientId;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDisease(){
        return disease;
    }

    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDisease(String disease){
        this.disease = disease;
    }

    public void bookAppointment(String doctorName){
        System.out.println("Appointment booked with Dr. " + doctorName + " for " + name + ".");
    }

    public void bookAppointment(String doctorName, String date) {
        System.out.println("Appointment booked with Dr. " + doctorName + " for " + name + " on " + date + ".");
    }

    public void printPatientDetails() {
        System.out.println("\nPatient Details");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Disease    : " + disease);
    }
}
