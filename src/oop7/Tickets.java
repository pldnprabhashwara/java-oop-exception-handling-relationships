package oop7;

public class Tickets {
    private String ticketID;
    private String eventName;
    private String seatNumber;
    private double price;

    Tickets(String ticketID, String eventName, String seatNumber, double price) {
        this.ticketID = ticketID;
        this.eventName = eventName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }


    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price! Price cannot be below 0.");
            System.out.println("Setting price to 0.0 by default.");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void display() {
        System.out.println("------------------------------");
        System.out.println("  Ticket ID   : " + ticketID);
        System.out.println("  Event       : " + eventName);
        System.out.println("  Seat        : " + seatNumber);
        System.out.println("  Price       : LKR " + price);
        System.out.println("------------------------------");
    }




}
