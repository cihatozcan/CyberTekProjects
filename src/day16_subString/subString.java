package day16_subString;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the first number");
        double x = console.nextDouble();
        System.out.println("Enter the second number");
        double y = console.nextDouble();
        System.out.println("Which calculation?//+,-,/,*,%");
        String a=console.next();
        switch (a.charAt(0) ){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            case '%':
                System.out.println(x%y);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
