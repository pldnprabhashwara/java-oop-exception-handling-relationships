package oop11;

public class FlightBooking {

    public void bookSeat(int seatNumber, boolean isBooked)
        throws SeatNotAvailableException,InvalidSeatNumberException{
        if(seatNumber < 1 || seatNumber > 200){
            throw new InvalidSeatNumberException("Invalid seat number. Must be between 1 and 200.");
        }

        if(isBooked == false){
            throw new SeatNotAvailableException("Seat " + (seatNumber) + " is already booked");
        }
    }
}
