package OOP_Assignment;

public class Rental_Catalogue_Transaction {
    
    public String viewRentalCatalogue(){
        StringBuilder result = new StringBuilder();
        result.append("==================== RENTAL CATALOGUE ===================").append(System.lineSeparator());
        result.append("+--------+--------------------+--------------+----------+").append(System.lineSeparator());
        result.append("| Code   | Name               | Category     | Price    |").append(System.lineSeparator());
        result.append("+--------+--------------------+--------------+----------+").append(System.lineSeparator());
        result.append("| E001   | Basketball Ball    | Equipment    | RM5.00   |").append(System.lineSeparator());
        result.append("| E002   | Football Ball      | Equipment    | RM5.00   |").append(System.lineSeparator());
        result.append("| E003   | Tennis Racket      | Equipment    | RM4.00   |").append(System.lineSeparator());
        result.append("| E004   | Tennis Ball        | Equipment    | RM3.00   |").append(System.lineSeparator());
        result.append("| F001   | Basketball Court   | Facility     | RM25.00  |").append(System.lineSeparator());        
        result.append("| F002   | Tennis Court       | Facility     | RM25.00  |").append(System.lineSeparator());
        result.append("| A001   | Glove              | Accessories  | RM4.00   |").append(System.lineSeparator());
        result.append("| A002   | Straps             | Accessories  | RM4.00   |").append(System.lineSeparator());
        result.append("+--------+--------------------+--------------+----------+").append(System.lineSeparator());
        return result.toString();
    }



}
