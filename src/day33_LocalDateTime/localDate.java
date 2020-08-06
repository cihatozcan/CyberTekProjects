package day33_LocalDateTime;

import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        LocalDate DOB = LocalDate.of(2020,7,24);
        System.out.println(DOB);

        LocalDate today= LocalDate.now();

        System.out.println(today);
        LocalDate y =LocalDate.of(2019,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);
    }
}
