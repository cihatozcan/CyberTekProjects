package day14_switch;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x=console.nextInt();

        switch (x){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


    }
}
