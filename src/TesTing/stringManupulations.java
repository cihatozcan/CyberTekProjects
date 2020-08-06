package TesTing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class stringManupulations {
    public static void main(String[] args) {












        /*
        //sum of given max number
        Scanner scan = new Scanner(System.in);
        int sum=0;
        System.out.println("What is the max number");
        int max=scan.nextInt();
        for (int i = 1; i <=max; i++) {
            sum+=i;


        }
        System.out.println("Your sum is: "+sum);


        /*
        //even
        int sum=0;
        for (int i = 1; i <=50 ; i++) {
            sum+=2*i;

        }
        System.out.println("Your sum is:"+sum);


        /*
        //odd numbers
        int sum=0;
        for (int i = 1; i <=50 ; i++) {
            sum+=2*i-1;
        }
        System.out.println("Your sum is:"+sum);

      /* int sum=0;
        for (int i = 1; i <=100; i++) {
            sum+=i;
        }
        System.out.println("Your sum is "+sum);

       /* System.out.print("* * * * * *");
        System.out.println();
        for (int i = 0; i <8 ; i++) {
            System.out.print("*         *");
            System.out.println();
            
        }
        System.out.print("* * * * * *");

        /*for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <6 ; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }

        /*
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                System.out.print(" FINRA ");
            }
            else if(i%3==0){
                System.out.print(" FIN ");
            }
            else if(i%5==0){
                System.out.print(" RA ");
            }
            else{
                System.out.print(i+" ");
            }
        }





        /*
        int[][] data =  new int[6][8];
        for (int i = 0; i <data.length; i++) {


            for (int k = 0; k < data[0].length; k++) {
                data[i][k] = i * k;


            }
        }
        int [] data1 = Arrays.copyOfRange(data,[0][5],)


/*
        }
        System.out.println(Arrays.deepToString(data));
        for (int i = 0; i <data[0].length ; i++) {
            data[i][2]=data[i][4];

        }
        System.out.println(Arrays.deepToString(data));

/*

        int [][] number = new int[3][4];
        for(int r=0;r<number.length;r++){
            for(int c=0;c<number[0].length;c++){
                number[r][c]=r+c;
            }
        }
        System.out.println(Arrays.deepToString(number));







        System.out.println(avStrings(data));



        int i=0;
        System.out.println(2*i%8);
        int[] testArray = {-1, -2, -4, 0,9,12};
        int[] testArray1 = {1, 2, 63, 6,1};
        swapPairs(testArray);
        System.out.println(Arrays.toString(testArray));
        swapPairs(testArray1);
        System.out.println(Arrays.toString(testArray1));

        System.out.println(averageArray(testArray));
        Scanner scan = new Scanner(System.in);
        System.out.println(Arrays.toString(testArray));
        System.out.println("What is max");
        int max = scan.nextInt();
        System.out.println("What is min");
        int min = scan.nextInt();
        int[] oddnumber = new int[(int) ((max - min) / 2)];

        for (int i = 0; i < oddnumber.length; i++) {


            oddnumber[i] = (2 * i - 1) - 4;


        }
        System.out.println(Arrays.toString(oddnumber));

*/
    }

    public static int findMax(int[] array) {
        int max = -99999;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public static double averageArray(int[] array) {
        double sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum / (array.length);
    }

    public static void printBackwards(int[] array) {
        System.out.print("[" + array[array.length - 1]);
        for (int i = array.length - 2; i >= 0; i--) {
            System.out.print(", " + array[i]);

        }
        System.out.print("]");
    }

    public static boolean istheSame(int[] array, int[] array1) {
        boolean result = false;
        if (array.length == array1.length) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] < array1[i]) {
                    result = true;
                } else {
                    result = false;
                }

            }

        } else {
            return result;
        }
        return result;
    }

    public static void swapPairs(int[] array) {
        int temp = 0;
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length - 1; i = i + 2) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

            }
        } else {
            for (int i = 0; i < array.length - 1; i = i + 2) {

                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

            }
        }
    }
    public static double avStrings(String[] array){
        double sum=0,average=0;
        for (int i = 0; i <array.length; i++) {
            sum+=array[i].length();

        }
        average=sum/(array.length);
        return average;
    }
    public static boolean palindrome(String[] array){
        boolean result=false;
        for (int i = 0; i <(array.length-1) ; i++) {
            if(array[i].equals(array[array.length-1-i])){
                result = true;
            }
            else{
                result=false;
            }





        }
        return result;
    }
}
