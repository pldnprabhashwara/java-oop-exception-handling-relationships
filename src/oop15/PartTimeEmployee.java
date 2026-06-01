package oop15;

public class PartTimeEmployee implements Payable{

    private String name;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate(){
        return hourlyRate * hoursWorked;
    }

    public String getName(){
        return name;
    }
}
