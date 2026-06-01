package oop5;

public class Professor {
    private String profID;
    private String name;
    private String specialization;

    Professor(String profID, String name, String specialization) {
        this.profID = profID;
        this.name = name;
        this.specialization = specialization;
    }

    public String getProfID(){
        return profID;
    }

    public String getName(){
        return name;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setProfID(String profID){
        this.profID = profID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public void display(){
        System.out.println("ID number is: " + profID);
        System.out.println("Name is: " + name);
        System.out.println("Specialization is: " + specialization);
    }
}
