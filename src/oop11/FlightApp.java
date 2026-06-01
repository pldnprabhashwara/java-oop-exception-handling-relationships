package oop11;
import java.util.Scanner;

public class FlightApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of seats: ");
        int seatNumber = input.nextInt();

        System.out.print("Is that seat available or not(true/false): ");
        boolean isBooked = input.nextBoolean();

        FlightBooking FB = new FlightBooking();

        try{

            try{
                if(seatNumber < 1 || seatNumber > 200){
                    throw new InvalidSeatNumberException("Invalid seat number. Must be between 1 and 200.");
                }
            }catch(InvalidSeatNumberException e){
                System.out.println("ERROR: " +  e.getMessage());
            }

            FB.bookSeat(seatNumber, isBooked);
            System.out.println("Seat booked successfully.");
        }catch(SeatNotAvailableException e){
            System.out.println("NOT AVAILABLE ERROR: " +  e.getMessage());
        }catch(InvalidSeatNumberException e){
            System.out.println("SEAT NUMBER INVALID ERROR: " +  e.getMessage());
        }finally{
            System.out.println("Seat booked successfully.");
        }
    }
}
