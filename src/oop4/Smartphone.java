package oop4;

public class Smartphone {
    private String model;
    private String brand;
    private double price;

    private Battery battery;
    private Camera camera;

    Smartphone(String model, String brand, double price,Battery battery, Camera camera){
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.battery = battery;
        this.camera = camera;
    }

    public String getModel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }

    public double getPrice(){
        return price;
    }

    public Battery getBattery(){
        return battery;
    }

    public Camera getCamera(){
        return camera;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setBattery(Battery battery){
        this.battery = battery;
    }

    public void setCamera(Camera camera){
        this.camera = camera;
    }

    public boolean isFlagship(){
        return (price > 200000);
    }

    public void display(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);

        if(isFlagship()){
            System.out.println("This phone is High range Phone...");
        }else{
            System.out.println("This phone is Low range Phone...");
        }
    }


}

