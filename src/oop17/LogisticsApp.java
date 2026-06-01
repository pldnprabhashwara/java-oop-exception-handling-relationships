package oop17;

public class LogisticsApp {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(101, "Colombo", "Nayana", 15.5);

        Shipment s2 = new Shipment(102, "Kandy");

        System.out.println("Shipment 1 Details");
        System.out.println("ID: " + s1.getShipmentId());
        System.out.println("Destination: " + s1.getDestination());
        System.out.println("Sender: " + s1.getSenderName());
        System.out.println("Weight: " + s1.getWeightKg() + " kg");

        System.out.println();

        System.out.println("Shipment 2 Details");
        System.out.println("ID: " + s2.getShipmentId());
        System.out.println("Destination: " + s2.getDestination());
        System.out.println("Sender: " + s2.getSenderName());
        System.out.println("Weight: " + s2.getWeightKg() + " kg");

        System.out.println();

        s1.estimateDelivery(600);

        System.out.println();

        s1.estimateDelivery(600, "express");

        System.out.println();

        s1.estimateDelivery(600, "express", 25.0);


    }
}
