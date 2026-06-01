package oop17;

public class Shipment {
    private int shipmentId;
    private String destination;
    private String senderName;
    private double weightKg;


    Shipment(int shipmentId, String destination, String senderName, double weightKg){
        this.shipmentId = shipmentId;
        this.destination = destination;
        this.senderName = senderName;
        this.weightKg = weightKg;
    }

    public Shipment(int shipmentId, String destination) {

        this.shipmentId = shipmentId;
        this.destination = destination;
        this.senderName = "Unknown";
        this.weightKg = 0.0;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public String getDestination(){
        return destination;
    }

    public String getSenderName(){
        return senderName;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public void setShipmentId(int shipmentId){
        this.shipmentId = shipmentId;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setSenderName(String senderName){
        this.senderName = senderName;
    }

    public void setWeightKg(double weightKg){
        this.weightKg = weightKg;
    }

    public void estimateDelivery(int distanceKm){
        double days = (double) distanceKm / 200;

        System.out.println("Estimated delivery days: " + days);
    }

    public void estimateDelivery(int distanceKm, String priority) {

        double days = (double) distanceKm / 200;

        if (priority.equalsIgnoreCase("express")) {
            days = days / 2;
        }

        System.out.println("Priority: " + priority);
        System.out.println("Estimated delivery days: " + days);
    }

    public void estimateDelivery(int distanceKm, String priority, double extraCharge){
        double days = (double) distanceKm / 200;

        if(priority.equalsIgnoreCase("express")){
            days = days / 2;
        }

        System.out.println("Priority: " + priority);
        System.out.println("Estimated delivery days: " + days);
        System.out.println("Extra charge: $" + extraCharge);
    }
}
