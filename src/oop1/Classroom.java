package oop1;

public class Classroom {
    private int roomNumber;
    private String grade;
    private int capacity;


    Classroom(int roomNumber, String grade, int capacity){
        this.roomNumber = roomNumber;
        this.grade = grade;
        this.capacity = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String Grade(){
        return grade;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setCapacity(int capacity){
        if(capacity < 10){
            System.out.println("Invalid! Capacity must be at least 10");
            System.out.println("Setting default capacity to 10.");
            this.capacity = 10;
        }else{
            this.capacity = capacity;
        }
    }

    public boolean isLargeRoom(){
        return capacity > 40;
    }


    public void display(){
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Capacity: " + capacity);
    }


}
