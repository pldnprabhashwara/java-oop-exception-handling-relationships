package oop15;
import java.util.ArrayList;

public class PayrollSystem {

    private static int totalEmployees = 0;

    private ArrayList<Payable> employeeList = new ArrayList<>();


    public void addEmployee(Payable e){
        employeeList.add(e);
        totalEmployees++;
    }

    public static int getTotalEmployees(){
        return totalEmployees;
    }

    public void displayPayroll(){
        System.out.println("====Payroll System====");

        for(Payable e: employeeList){
            System.out.println(
                    "Pay: " +
                            Payable.CURRENCY +
                            " " +
                            e.calculate()
            );
        }
    }
}
