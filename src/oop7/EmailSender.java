package oop7;

public class EmailSender {

    public void sendConfirmation(Tickets t){
        System.out.println("====== BOOKING CONFIRMATION ======");
        System.out.println("Dear Customer,");
        System.out.println("Your ticket has been confirmed!");
        System.out.println("  Event  : " + t.getEventName());
        System.out.println("  Seat   : " + t.getSeatNumber());
        System.out.println("  Amount : LKR " + t.getPrice());
        System.out.println("  Ref ID : " + t.getTicketID());
        System.out.println("==================================");
    }

    public void sendReminder(Tickets t) {
        System.out.println("====== EVENT REMINDER ======");
        System.out.println("Reminder: Your event is TOMORROW!");
        System.out.println("  Event  : " + t.getEventName());
        System.out.println("  Seat   : " + t.getSeatNumber());
        System.out.println("============================");
    }

    public void sendReminder(Tickets t, int daysLeft) {
        System.out.println("====== EVENT REMINDER ======");
        System.out.println("Reminder: " + daysLeft
                + " day(s) left for your event!");
        System.out.println("  Event  : " + t.getEventName());
        System.out.println("  Seat   : " + t.getSeatNumber());
        System.out.println("============================");
    }

    public void sendReminder(Tickets t, int daysLeft, String venueName) {
        System.out.println("====== EVENT REMINDER ======");
        System.out.println("Reminder: " + daysLeft
                + " day(s) left for your event!");
        System.out.println("  Event  : " + t.getEventName());
        System.out.println("  Seat   : " + t.getSeatNumber());
        System.out.println("  Venue  : " + venueName);
        System.out.println("============================");
    }

}
