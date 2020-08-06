package arrayListCh7;

import java.util.Arrays;

public class Exercies {
    public static void main(String[] args) {
        System.out.println(reverse("level"));
        for (int i = 1; i <=50 ; i++) {
            if(i%2==0)
                continue;
            System.out.print(i+" ");
        }
        for (int i = 1; i <=50; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }


    }
    public static boolean reverse(String s) {
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                result = true;
            } else {
                result = false;
            }



          }  return result;
    }}