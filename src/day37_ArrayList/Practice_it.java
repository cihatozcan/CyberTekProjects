package day37_ArrayList;

import java.util.ArrayList;

public class Practice_it {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> interArray(ArrayList<Integer> arr,ArrayList<Integer>arr1){

        int max=(arr.size()>arr1.size())?arr.size():arr1.size();
        for (int i = 0, k=1; i <max; i++,k+=2) {

                arr.add(k,arr1.get(i));
        }

        return arr;
    }
}
