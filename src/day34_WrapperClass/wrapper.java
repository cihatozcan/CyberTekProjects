package day34_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class wrapper {
    // Array supports primitives and non-primitives
    // Collection does not support primitives
    // Map does not support primitives
    //Wrapper class: Byte, Short, Integer,Character, Boolean, Long,Double
    /*
    07/26/2020
Topics: Wrapper Class
        ArrayList Intro
package name: day34_WrapperClasses
warmup tasks:
    1. use the LocalDate & Time get the current date and time in the following format:
            Sunday, 09:51 AM, Jul/26/2020
Data Structures:
            1. Array  ==> supports primitives and non-primitives
            2. Collection ==>  does not support primitives
            3. Map ==>   does not support primitives
Wrapper class: Byte,  Short,   Integer, Long,  Character, Boolean, Double,   Float
                byte   short      int    long    char      boolean  double   float
                Default values:
                    primitives:
                        byte, short, int, long ==> 0
                        double, float ==>0.0
                        boolean ==> false
                    wrapper class: null
    autoboxing: converting primitive values to wrapper class
                implicitly done
    unboxing: converting wrapper class values to primitive
            implicitly done
Integer, Double, Character, Boolean
        "123" ==>123

    methods:
        parse methods: converts string of text to primitive vlaue
                        not case sensitive
        valueOf methods: converts string of text to wrapper class value
                    not case sensitive

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(waterTax(101));
        Double []arr = new Double[10];
        arr[0]=scan.nextDouble();
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scan.nextDouble();
            System.out.println(Arrays.toString(arr));
        }
        Double x=0.0;



    }
    /*
    This method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).

for example:

waterTax(50)
returns 30

waterTax(55)
returns 49.5

waterTax(101)
returns 140.9

waterTax(151)
returns 235.9

the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;

above 100 the calculation is like above 50 but with a 50 as fine

and above 150 its the same as above 50 (units *0.90) but with a 100 fine added to the price .




     */
    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if (units<50){
            bill=units*0.60;
        }

        else{
            bill=units*0.90;
        }
        System.out.println(bill);
        if(units>100){
            bill+=50;
        }else if(units>150){
            bill+=100;
        }
        System.out.println(bill);
        //end your code here


        return bill;
    }//end waterTax
}
