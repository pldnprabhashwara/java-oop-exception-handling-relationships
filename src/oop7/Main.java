package oop7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ── Get Ticket details from user ──
        System.out.print("Enter ticket ID    : ");
        String ticketId = sc.nextLine();

        System.out.print("Enter event name   : ");
        String eventName = sc.nextLine();

        System.out.print("Enter seat number  : ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter price (LKR)  : ");
        double price = sc.nextDouble();
        sc.nextLine(); // clear leftover newline after nextDouble()

        // ── Create Ticket ──
        Tickets ticket = new Tickets(ticketId, eventName, seatNumber, price);

        // ── Display ticket details ──
        System.out.println("\n--- Ticket Details ---");
        ticket.display();

        // ── Get reminder details ──
        System.out.print("Enter days left    : ");
        int daysLeft = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter venue name   : ");
        String venueName = sc.nextLine();

        // ── Create EmailSender ──
        // Notice: EmailSender has NO Ticket field
        // Ticket is passed in as a parameter each time
        EmailSender emailSender = new EmailSender();

        // ── sendConfirmation ──
        System.out.println();
        emailSender.sendConfirmation(ticket);

        // ── All 3 sendReminder() versions ──
        System.out.println("\n--- Reminder Version 1 (ticket only) ---");
        emailSender.sendReminder(ticket);

        System.out.println("\n--- Reminder Version 2 (ticket + days) ---");
        emailSender.sendReminder(ticket, daysLeft);

        System.out.println("\n--- Reminder Version 3 (ticket + days + venue) ---");
        emailSender.sendReminder(ticket, daysLeft, venueName);

        sc.close();
    }
}