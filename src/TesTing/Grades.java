package TesTing;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a=console.nextDouble();
        double b=console.nextDouble();
        double c=console.nextDouble();
        System.out.println(quadraticEquations(a,b,c));





    }
    public static double quadraticEquations(double a,double b,double c){
        if(Math.sqrt(Math.pow(a,2)-4*a*c)<0||a==0){
            throw new IllegalArgumentException("imposible");

        }

        double result=(-b+Math.sqrt(Math.pow(a,2)-4*a*c))/2*a;
        return result;


    }
}
