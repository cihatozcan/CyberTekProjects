package day34_WrapperClass;

import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            int n=scan.nextInt();
            if(n>max){
                max=n;
            }
        }
        System.out.println(max);
    }
}
