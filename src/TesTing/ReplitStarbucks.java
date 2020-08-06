package TesTing;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplitStarbucks {
    public static ArrayList<String> combineAL(ArrayList<String> a, ArrayList<String> b){

        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            arr.add(a.get(i));
        }
        for(int i=0;i<b.size();i++){
            arr.add(b.get(i));
        }
        return arr;

    }
    /*
    Create a static method that:

is called appendPosSum returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
 This method should:Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element
For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
 The original ArrayList should remain unchanged.

     */
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer>arr){
        int sum=0;
        ArrayList<Integer> arrnew = new ArrayList<>();
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i)>0){
                sum+=arr.get(i);
                arrnew.add(arr.get(i));
            }
        }
        arrnew.add(sum);
        return arr;
    }
    public static boolean isPalindrome(String check) {
        check=check.toLowerCase();
        for(int i=0;i<check.length()/2;i++){
            if(check.charAt(i)!=check.charAt(check.length()-1-i)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String [] arr={"1","g","aabb","7","7","2","aa","7"};
        System.out.println(getDup(arr));
    }
    public static int getDup(String[] r)
    {
        String [] arr=r;
        int count=0;
        int uniqueNumber=0;
        String k="";
        for(int i=0;i<r.length;i++){

            for(int j=0;j<r.length;j++){
                if(r[i].equals(r[j])&&i!=j){
                    if(Character.isDigit(r[i].charAt(0))) {
                        k += r[i].charAt(0)+"";
                    }

                    break;
                }

            }
        }

        return k.length();
    }



}



    

