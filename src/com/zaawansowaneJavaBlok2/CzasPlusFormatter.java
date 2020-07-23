package com.zaawansowaneJavaBlok2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CzasPlusFormatter {
    //LocalDate 	Represents a date (year, month, day (yyyy-MM-dd))
    //LocalTime 	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    //LocalDateTime 	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    //DateTimeFormatter 	Formatter for displaying and parsing date-time objects

    //The "T" in the example above is used to separate the date from the time. You can use the
    // DateTimeFormatter class with the ofPattern() method in the same package to format or parse
    // date-time objects. The following example will remove both the "T" and nanoseconds from the date-time:
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
//WZORY:
    //yyyy-MM-dd 	"1988-09-29"
    //dd/MM/yyyy 	"29/09/1988"
    //dd-MMM-yyyy 	"29-Sep-1988"
    //E, MMM dd yyyy 	"Thu, Sep 29 1988"
}
