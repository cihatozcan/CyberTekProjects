package TesTing;

import java.util.Scanner;

public class KingsandSpadespg302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("What is the first ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        System.out.println(triangle1(a,b,c));


    }
    public static String triangle1(int a , int b , int c){
        String triangle1,triangle2,triangle3;
        triangle1="isosceles";
        triangle2="equilateral";
        triangle3="scalene";
        if(a<=0 || b<=0 || c<=0){
            throw new IllegalArgumentException("negative numbers");
        }
        if(a==b || a==c || b==c){
            return triangle1;
        }
        else if(a==b&&a==c){
            return triangle2;
        }
        else{
            return triangle3;
        }
    }
}
