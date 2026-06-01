package oop2;

public class Publisher {
    private String publisherName;
    private String country;

    Publisher(String publisherName, String country){
        this.publisherName = publisherName;
        this.country = country;
    }

    public String getPublisherName(){
        return publisherName;
    }

    public String getCountry(){
        return country;
    }

    public void setPublisherName(String publisherName){
        this.publisherName = publisherName;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void display(){
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher Country: " + country);
    }
}
