package day33_LocalDateTime;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class decimalFormat {


    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        int year=1994,month=05,dayofMonth=21;
        LocalDate DOB = LocalDate.of(year,month,dayofMonth);
        System.out.println(DOB);

        double a=10/3.0;
        System.out.println(a);
        System.out.println(df.format(a));
    }
}
