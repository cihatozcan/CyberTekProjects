package TesTing;

import java.util.Arrays;

public class Replit_Task158 {
    public static void main(String[] args) {
        System.out.println(mergeString("java","selenium"));

    }
    /*
    When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
     */
    public static String mergeString(String one,String two){
        int size=0;
        if(one.length()>two.length()){
            size=one.length();
        }
        else{
            size=two.length();
        }
        String mergeString="";
        for (int i = 0; i <=size-1; i++) {
            if(i<one.length()){
                mergeString+=one.charAt(i);
            }
            if(i<two.length()){
                mergeString+=two.charAt(i);
            }
        }

        return mergeString;
    }
}
