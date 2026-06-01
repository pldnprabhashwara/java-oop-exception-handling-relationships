package oop4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("-Smartphone & Battery + Camera system-");
        System.out.println("--------------------------------------");
        System.out.print("Enter your Phone Model: ");
        String model = input.nextLine();
        System.out.print("Enter Your Phone Brand: ");
        String brand = input.nextLine();
        System.out.print("Enter Your Phone Price: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Your Battery Capacity: ");
        int batteryCapacity = input.nextInt();
        System.out.print("Enter Your Battery Brand: ");
        String batteryBrand = input.nextLine();
        System.out.print("Enter Your Camera Megapixels: ");
        double cameraMegapixels = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Your Camera Type: ");
        String cameraType = input.nextLine();

        System.out.println("--------------------------------------");
        Battery battery = new Battery(batteryCapacity, batteryBrand);
        Camera camera = new Camera(cameraMegapixels, cameraType);
        Smartphone sm = new Smartphone(model, brand, price, battery, camera);
        sm.display();
    }
}
