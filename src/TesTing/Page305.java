package TesTing;

import java.util.Scanner;

public class Page305 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int month=scanner.nextInt();
        int day=scanner.nextInt();
        System.out.println(month(month,day));


    }
    public static String month(int month,int day) {
        String ay="";
        String season="";
        if(month>12||month<0||day<0||day>31){
            throw new IllegalArgumentException("not a date");
        }
        if(month==1){
            ay="January";
            season="winter";
        }
        if(month==2){
            ay="February";
            season="winter";
        }
        if(month==3){
            ay="March";
            if(day>16){
                season="spring";
            }
            else{
                season="winter";
            }
        }
        if(month==4){
            ay="April";
            season="spring";
        }if(month==5){
            ay="May";
            season="spring";
        }if(month==6){
            ay="June";
            if(day>16){
                season="summer";
            }
            else{
                season="spring";
            }
        }
        if(month==7){
            ay="July";
            season="summer";
        }
        if(month==8){
            ay="August";
            season="summer";
        }
        if(month==9){
            ay="September";
            if(day>16){
                season="fall";
            }
            else{
                season="summer";
            }
        }
        if(month==10){
            ay="October";
            season="fall";
        }
        if(month==11){
            ay="November";
            season="fall";
        }
        if(month==12){
            ay="December";
            if(day > 16){
                season="winter";
            }
            else{
                season="fall";
            }
        }
        return day+" "+ay+" "+season;







    }

}
