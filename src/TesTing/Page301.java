package TesTing;

import java.util.Scanner;

public class Page301 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What color do you want?");
        String option=console.next();
        option.toLowerCase();
        if(option.charAt(0)=='a'){
            System.out.println("You have chosen Blue");
        }
        else if(option.charAt(0)=='b'){
            System.out.println("You have chosen Green");
        }
        else if(option.charAt(0)=='r'){
            System.out.println("You have chosen Green");
        }
        else{
            System.out.println("Unknown color:"+option);
        }
    }
}
