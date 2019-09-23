/*
 Write a Java program to get and display information (year, month, day, hour,
minute) of a default calendar.

 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Date_Time_Display {

    public static void main(String[] args) {
        System.out.println("\n \t Java Program to display current date and time ");

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:mm");
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(dt.format(now));

    }

}
