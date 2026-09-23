package OOP_Assignment;
import java.time.*;

public class Facility_Booking {
    
    private String customerName = " ";
    private String contactNumber = " ";
    private LocalDate bookingDate;
    private LocalTime bookingTime;
    private int numberOfParticipants = 0;
    private FacilityType facilityType;

    public enum FacilityType{
        BASKETBALL_COURT, TENNIS_COURT
        
    }

    Facility_Booking(String customerName, String contactNumber, LocalDate bookingDate, LocalTime bookingTime, int numberOfParticipants, FacilityType facilityType){
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.numberOfParticipants = numberOfParticipants;
        this.facilityType = facilityType;
    }
    

    public String getCustomerName(){
        return customerName; 
    }

    public String getContactNumber(){
        return contactNumber;  
    }

    public LocalDate getBookingDate(){
        return bookingDate;  
    }

    public LocalTime getBookingTime(){
        return bookingTime;  
    }
    

    public int getNumberOfParticipants(){
        return numberOfParticipants;  
    }

    public FacilityType getFacilityType(){
        return facilityType; 
    }
    

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public void setBookingDate(LocalDate bookingDate){
        this.bookingDate = bookingDate;
    }

    public void setBookingTime(LocalTime bookingTime){
        this.bookingTime = bookingTime;
    }

    public void setNumberOfParticipants(int numberOfParticipants){
        this.numberOfParticipants = numberOfParticipants;
    }

    public void setFacilityType(FacilityType facilityType){
        this.facilityType = facilityType;
    }
    
    
}
