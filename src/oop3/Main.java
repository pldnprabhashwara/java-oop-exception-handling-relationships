package oop3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====Hospital & Heart system=====");
        System.out.print("Enter the Patient ID: ");
        String patientId = input.nextLine();

        System.out.print("Enter the Patient Name: ");
        String patientName = input.nextLine();

        System.out.print("Enter the Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("------------------------------------------");
        System.out.print("Enter the Heart Type: ");
        String type = input.nextLine();

        System.out.print("Enter the Heart Rate: ");
        int rate = input.nextInt();

        Heart heart = new Heart(type,rate);

        Patient patient = new Patient(patientId,patientName,age,heart);
        System.out.println("-------------------------------------------");

        heart.display();
    }
}
