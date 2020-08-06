package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("four");
        arr.add("2222");
        arr.add("3");
        arr.add("99");
        arr.add("0");
        arr.add("1");
        arr.add("0");
        arr.remove(2);

        System.out.println(stutter(arr,4));


    }
    public static ArrayList<String> stutter(ArrayList<String> s, int k){
        ArrayList<String> list2 = new ArrayList<>();
        if (k > 0) {
            int count = s.size();
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < k; j++) {
                    list2.add(s.get(i));
                }
            }
        }else{
            list2.clear();
        }
        return list2;
    }
    public static ArrayList<Integer> removeInRange(ArrayList<Integer> arr,int element, int start,int
            end){

        

        return arr;




    }
    public static void removeShorterStrings(ArrayList<String> arr){

        for(int i=arr.size()-1;i>=0;i-=2){


        }


    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i+=2){
            arr.add(i,arr.get(i));
        }
        return arr;
    }
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {
        int sum=0;
        for(int i=0;i<deliveries.size();i++)
            sum+=deliveries.get(i);

        sum=sum/max_fuel;
        sum=(int)Math.ceil(sum);
        return sum;

    }
}
