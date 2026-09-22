package OOP_Assignment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Facility_Booking_Manager {
    
        private ArrayList<Facility_Booking> bookingRecords;
        
        public Facility_Booking_Manager(){
            bookingRecords = new ArrayList<>();
        }


        public String addBooking(String customerName, String contactNumber, LocalDate bookingDate, LocalTime bookingTime, int numberOfParticipants, Facility_Booking.FacilityType facilityType){
            // do an if else validity checking
            Facility_Booking newBooking = new Facility_Booking(customerName, contactNumber, bookingDate, bookingTime, numberOfParticipants, facilityType);
            bookingRecords.add(newBooking);
            return "Booking confirmed for " + customerName + " on " + bookingDate + " at " + bookingTime + ".";
        }

        public String viewBookings(){

            
            return "";
        }


        public String cancelBooking(){

            return "";
        }

            


            

        





        



}