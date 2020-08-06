package TesTing;

import java.util.Arrays;

public class Interviewquestions {
    public static void main(String[] args) {
        /*
        Write a nested loop

            1
           22
          333
         4444
        55555
        */

        int temp;
        int [] arr ={1,1,2,3,3,4};

        for (int i = 0; i < arr.length/2; i++)
        {
            temp = arr[i];

            arr[i] = arr[arr.length-1-i];

            arr[arr.length-1-i] = temp;
        } System.out.println(Arrays.toString(arr));
    }}




















/*
        for (int i = 1; i <=7 ; i++) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
        }

        }}

















        /*
        for (int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }



    }
}
*/