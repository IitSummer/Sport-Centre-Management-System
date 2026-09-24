package OOP_Assignment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Facility_Booking_Manager {
    
        private static final String FILE_PATH = "bookings.txt"; 

        public String addBooking(String customerName, String contactNumber, LocalDate bookingDate, LocalTime bookingTime, int numberOfParticipants, Facility_Booking.FacilityType facilityType){
            
            
            // do an if else validity checking
            Facility_Booking newBooking = new Facility_Booking(customerName, contactNumber, bookingDate, bookingTime, numberOfParticipants, facilityType);
            
            String line = newBooking.getCustomerName() + 
                            "|" + newBooking.getContactNumber() +
                            "|" + newBooking.getBookingDate() +
                            "|" + newBooking.getBookingTime() +
                            "|" + newBooking.getNumberOfParticipants() +
                            "|" + newBooking.getFacilityType();

            try (FileWriter writer = new FileWriter(FILE_PATH, true)){
                writer.write(line);
                writer.write(System.lineSeparator());

            } catch (IOException e){
                return  "Booking failed: could not save to file. " + e.getMessage();
            }

            return "Booking confirmed for " + customerName + " on " + bookingDate + " at " + bookingTime + ".";
        }




        public String viewBookings(){
            StringBuilder result = new StringBuilder();
            int count = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\|");

                    count++;
                    result.append(count).append(". ")
                        .append("Customer: ").append(parts[0])
                        .append(", Contact: ").append(parts[1])
                        .append(", Date: ").append(parts[2])
                        .append(", Time: ").append(parts[3])
                        .append(", Participants: ").append(parts[4])
                        .append(", Facility: ").append(parts[5])
                        .append(System.lineSeparator());
                }

            } catch (FileNotFoundException e) {
                return "No bookings found.";
            } catch (IOException e) {
                return "Something went wrong while reading bookings.";
            }

            if (count == 0) {
                return "No bookings found.";
            }

            return result.toString();
        }


        public String cancelBooking(){

            return "";
        }

            


            

        





        



}