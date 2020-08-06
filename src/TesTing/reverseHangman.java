package TesTing;

import java.util.Random;
import java.util.Scanner;

public class reverseHangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        String sentence="";
        boolean result;
        System.out.println("how many letters your word contains");
        int length = scan.nextInt();

        for(int i=0;i<=length;i++){
            result=true;
            while(result) {
                char c = (char) (r.nextInt(26) + 'a');
                System.out.println(i+1 + " " + c + " word?");
                result = scan.nextBoolean();
                if (result) {
                    sentence += c;
                    break;
                }

            }
        }
        System.out.println(sentence);
    }
}
