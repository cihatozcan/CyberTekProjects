package TesTing;

import java.util.Scanner;

public class Matching {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       int count=0;
        System.out.println("How many numbers do you have?");
        int numbers=console.nextInt();
        for(int i=0;i<numbers;i++){
            System.out.println("What is #"+i+" number?");
            int next=console.nextInt();
            if(next<0){
                count++;
            }
        }
        System.out.println("You have "+count+" negative numbers");


    }
}
