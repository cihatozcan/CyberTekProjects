package TesTing;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class ch4 {
    public static void main(String[] args) {
        System.out.println(factoriel(5));
        System.out.println(frequencyOfChars("ali veli kirk dokuz elli"));
        String s="javaxjava";
        System.out.println(s.contains("java"));


    }
    public static int factoriel(int x){
        int total=1;
        for (int i = x; i >=1; i--) {
            total*=i;
        }
        return total;
    }

    public static String frequencyOfChars(String x){

        String uniques = "";

        for (int i = 0; i < x.length() ; i++) {
            while (!(uniques.contains(x.charAt(i)+""))){
                uniques += x.charAt(i)+"";
            }
        }
        String result="";
        for (int i = 0; i < uniques.length() ; i++) {
            int count = 0;
            for (int j = 0; j < x.length() ; j++) {

                if (uniques.charAt(i) == x.charAt(j)){
                    count++;
                }

            }  result += uniques.charAt(i)+""+count;
        }

        return result;
    }











    /*
    public static String frequencyOfCharacters(String s){
        String k="";
        String result="";
        for (int i = 0; i <s.length() ; i++) {
            while(!(k.contains(s.charAt(i)+""))){
                k+=s.charAt(i)+"";
            }
        }
        for (int i = 0; i <k.length(); i++) {
            int count=0;
            for (int j = 0; j < s.length(); j++) {
                if(k.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            result+=k.charAt(i)+""+count;
        }
        return result;


    }*/
}
