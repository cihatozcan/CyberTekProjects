package day35_warmup;

import java.util.ArrayList;

public class tasks {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

    }
    /*
     1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
     */
    public static void printReverse(int[]arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void printReverse(ArrayList<Integer> arr){
        for (int i = arr.size()-1; i >=0 ; i--) {
            System.out.print(arr.get(i)+" ");

        }
    }

    /*
      2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */
    public static int sumDigit(String s){
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>=48&&s.charAt(i)<=57){
                int x=Character.getNumericValue(s.charAt(i));
                sum+=x;
            }
        }
        return sum;
    }
    /*
     3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
Collapse
     */
    public static ArrayList<String> combineArray(String[]arr,String[]arr2){
        ArrayList <String> newArr=new ArrayList<>();
        int index=0;
        for(String each:arr){
            newArr.add(index,each);
            index++;
        }
        for(String each:arr2){
            newArr.add(index,each);
            index++;
        }
        return newArr;

    }


}
