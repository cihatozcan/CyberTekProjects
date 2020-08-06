package TesTing;

import java.util.Scanner;
/*while(input.hasNext()){
        String word=input.next();
        count++;
        }*/

public class pigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence");
        int x=0;
        String sentence = scanner.next();
        while(scanner.hasNext()){




            for ( int i=0;  i<= sentence.length(); i++) {


                if (seslimi(sentence.charAt(i))) {





                    sentence = sentence.substring(i, sentence.length()) + "-" + sentence.substring(0, i) + "ay";
                    System.out.println(sentence);
                    break;

                }


                sentence=scanner.next();
        }}


    }
    public static boolean seslimi(char a){
        if(a=='a'||a=='e'||a=='u'||a=='i'||a=='o'){
            return true;
        }
        else{
            return false;
        }
    }

}
