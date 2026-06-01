package oop15;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payroll =  new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("John Doily", 5000);
        FullTimeEmployee emp2 = new FullTimeEmployee("Janaka", 5000);

        PartTimeEmployee emp3 = new PartTimeEmployee("David", 40, 30);
        PartTimeEmployee emp4 = new PartTimeEmployee("John Doe", 40, 30);

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp4);

        payroll.displayPayroll();

        System.out.println("\nTotal Employees: " + PayrollSystem.getTotalEmployees());
    }
}
