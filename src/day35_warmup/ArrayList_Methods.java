package day35_warmup;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
       ArrayList<String> asd=new ArrayList<>();



    }
    /*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
     */
    public static void dateFormatter(String s){
    DateTimeFormatter df =DateTimeFormatter.ofPattern("HH:mm:ss");
    if(s.endsWith("AM")){

    }
    }
}
