package oop15;

public class FullTimeEmployee implements Payable{
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary){
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculate() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }
}
