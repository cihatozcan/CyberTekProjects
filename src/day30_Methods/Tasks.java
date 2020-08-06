package day30_Methods;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        String arr[]={"A","C","E"};
        String arr1[]={"B","D","F"};

        String[] arr3= new String[arr.length+arr1.length];

        for (int i = 0; i <arr.length ; i++) {
            arr3[i]=arr[i];
        }
        int a=0;
        for (int i = arr.length; i <arr3.length ; i++) {
            arr3[i]=arr1[a];
            a++;
        }
        for (int i = 0; i <arr3.length ; i++) {
            int count=0;
            for (int j = 0; j < arr3.length; j++) {
                if(arr3[i].equalsIgnoreCase(arr3[j])){
                    continue;
                }else if(arr3[i].charAt(0)>arr3[j].charAt(0)){
                    count++;
                }
            }
            arr3[count]=arr3[i];
        }
        System.out.println(Arrays.toString(arr3));



    }
    public static String alphabetical(String s){
        String a = "";
        s=removeDuplicates(s);
        char[] arr= s.toCharArray();
        char temp=arr[0];
        a+=arr[0];
        for (int i = 0; i <s.length(); i++) {

              if(arr[i]>temp){
                  temp=arr[i];
                  a+=temp;
              }

        }

        return a;
    }
    public static int[] combinationArr(int[]a,int[]b){
        int[]arr=new int[a.length+b.length];
        for (int i = 0; i < arr.length; i++) {
            if(i>=a.length){
                arr[i]=b[i-a.length];
                continue;
            }
            arr[i]=a[i];

        }

        return arr;
    }
    public static int maxNumber(int x,int y){
        if(x>=y){
            return x;
        }
        else {
            return y;
        }
    }
    public static int[] descendingOrder(int[]arr){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static String removeDuplicates(String str){
        String nonDup = "";
        for (int i = 0; i <= str.length()-1 ; i++) {
            for (String each : str.split("")) {
                if (!nonDup.contains(each)){
                    nonDup += each;
                }
            }
        }return nonDup;
    }
    //task1
    public static String fullName(String first,String second){
        String s=first.toUpperCase().charAt(0)+first.toLowerCase().substring(1,first.length())+" "+
                second.toUpperCase().charAt(0)+second.toLowerCase().substring(1,second.length());

        return s;
    }//task3
    public static int[] addArray(int[]arr,int x){
        int[] arr1=new int[arr.length+1];
        arr1[arr.length]=x;
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }
/*
Warmup tasks:
    1. write a method that can retunr the full name of a person in regular format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
                CYBERTEK>>firstName.toUpperCase();
                01234567>>

                C        >>firstName.toUpperCase().charAt(0);

 */

    public static String fullnamee(String firstName,String lastName){
        String s=firstName.toUpperCase().charAt(0)+firstName.toLowerCase().substring(1,firstName.length())+" "+lastName.toUpperCase().charAt(0)+
                lastName.toLowerCase().substring(1,lastName.length());
        return s;



    }/*
     3. write a method that can add element to an array, the method accepts an array and and a number, then returns the
     new array by appending the number to the last index of the given array
    Ex:
    int[] arr = {1,2,3};
    int num = 4;
    addElement(arr, num); ===> {1,2,3,4}*/
    public static int[] addElementss(int[]arr,int num) {
      int [] newArray=new int[arr.length+1];
      newArray[arr.length]=num;
      //{0,0,0,4}
        for (int i = 0; i < arr.length; i++) {
           newArray[i]=arr[i];
        }
        return newArray;


    }














}
