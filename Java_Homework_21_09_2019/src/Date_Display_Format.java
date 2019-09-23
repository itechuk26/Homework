/*
25. Write a Java program to display the dates in the following formats.

Sample format:

Default format of LocalDate=2016-09-16
16::Sep::2016
Default format of LocalDateTime=2016-09-16T11:46:01.455
16::Sep::2016 11::46::01
Default format of Instant=2016-09-16T06:16:01.456Z
Default format after parsing = 2014-04-27T21:39:48

 */



import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Display_Format {

    public static void main(String[] args) {

        //Format examples

        LocalDate date = LocalDate.now();

        System.out.println("\nDefault format of LocalDate="+date);     //default format
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));    //specific format

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime="+dateTime);      //default format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));   //specific format

        Instant timestamp = Instant.now();
        System.out.println("Default format of Instant="+timestamp);          //default format

        LocalDateTime dt = LocalDateTime.parse("23::Sep::2019 09::27::48",          ////Parse examples
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = "+dt+"\n");
    }
}