package oop4;

public class Battery {
    private int capacity;
    private String batteryBrand;

    Battery(int capacity, String batteryBrand){
        this.capacity = capacity;
        this.batteryBrand = batteryBrand;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getBatteryBrand(){
        return batteryBrand;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setBatteryBrand(String batteryBrand){
        this.batteryBrand = batteryBrand;
    }

    public boolean hasFastCharging(){
        return (capacity > 4500);
    }

    public void display(){
        System.out.println("Battery Capacity: " + capacity);
        System.out.println("Battery Brand: " + batteryBrand);

        System.out.println("--------------------------------------");

        if(hasFastCharging()){
            System.out.println("Battery is high performance...");
        }else{
            System.out.println("Battery is middle performance...");
        }
    }

}
