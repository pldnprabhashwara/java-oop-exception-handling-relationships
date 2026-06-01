package oop3;

public class Patient {
    private String patientID;
    private String patientName;
    private int age;

    private Heart heart;

    Patient(String patientID, String patientName, int age, Heart heart){
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.heart = heart;
    }

    public String getPatientID(){
        return patientID;
    }

    public String getPatientName(){
        return patientName;
    }

    public int getAge(){
        return age;
    }

    public Heart getHeart(){
        return heart;
    }

    public void setPatientID(String patientID){
        this.patientID = patientID;
    }

    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHeart(Heart heart){
        this.heart = heart;
    }

    public void display(){
        System.out.println("Patient ID: " + patientID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Heart: " + heart);


    }
}
