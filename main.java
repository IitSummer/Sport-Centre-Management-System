package OOP_Assignment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class main {
    
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        Facility_Booking_Manager bookingManager = new Facility_Booking_Manager();

        // All of main's fields
        int StaffFunctionInput, numberOfParticipants, facilityChoice;
        String customerName, contactNumber, dateInput, timeInput;
        DateTimeFormatter dateFormat, timeFormat;
        
        LocalDate bookingDate;
        LocalTime bookingTime;


        // Menu
        System.out.println("\n===== TASTEHUB SYSTEM =====");
        System.out.println("1. Facility Booking Module ");
        System.out.println("2. View Rental Catalogue");
        System.out.println("3. Create Rental Transaction");
        System.out.println("4. Apply Promotion");
        System.out.println("5. Make Payment");
        System.out.println("6. Daily Report");
        System.out.println("7. Exit");
        System.out.print("Enter a number: ");
        StaffFunctionInput = input.nextInt();
        input.nextLine();


        
        switch(StaffFunctionInput){

            case 1: 
                System.out.print("\nEnter Customer Name: ");
                customerName = input.nextLine();

                System.out.print("\nEnter Customer's Contact Number: ");
                contactNumber = input.nextLine();

                System.out.print("Enter booking date (dd/MM/yyyy): ");
                dateInput = input.nextLine();
                dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                bookingDate = LocalDate.parse(dateInput, dateFormat);

                System.out.print("Enter booking time (HH:mm): ");
                timeInput = input.nextLine();
                timeFormat = DateTimeFormatter.ofPattern("HH:mm");
                bookingTime = LocalTime.parse(timeInput, timeFormat);

                System.out.print("\nEnter Number of Participants: ");
                numberOfParticipants = input.nextInt();
                input.nextLine();

                System.out.print("\nEnter Facility Type 1 or 2: ");
                System.out.print()
                facilityChoice = input.nextInt();
                input.nextLine();
                Facility_Booking.FacilityType facilityType;

                if (facilityChoice == 1) {
                facilityType = Facility_Booking.FacilityType.BASKETBALL_COURT;
                } else {
                facilityType = Facility_Booking.FacilityType.TENNIS_COURT;
                }

                String bookingRecord = bookingManager.addBooking(customerName, contactNumber, bookingDate, bookingTime, numberOfParticipants, facilityType);

                


            break;


            case 2:


            break;

            default:

        }




        
        input.close();
    }
}
