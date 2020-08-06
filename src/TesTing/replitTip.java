package TesTing;
/*
write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class replitTip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] data= {10,20,3,4,5,6,7,-10,-100,300,400};
        int max=data[0];
        int min=data[0];
        for (int j = 1; j <=data.length-1 ; j++) {
            if(data[j]>=max){
                max=data[j];
            }
            if(data[j]<=min){
                min=data[j];
            }

        }
        System.out.println(min);
        System.out.println(max);





        /*

        System.out.println("How many number will you input?");
        int number=scan.nextInt();
        for (int i = 0; i <number; i++) {
            data[i]=scan.nextInt();

        }

        /*
        String result="";
        String word="";
        int count=0;
        for (int i=0; i<=str.length()-1; i++){
            String s=""+str.charAt(i);
            if (!result.contains(s)){
                result+=s;
            }
        }
        for (int i = 0; i < result.length() ; i++) {
            count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)==result.charAt(i)){
                    count++;
                }
            }
            word+=result.charAt(i)+""+count;
        }*/

    }}
        /*
        int sum=0;
        String answer="";
        System.out.println("How many number do you want to sum?");
        int numbers=scan.nextInt();
        while(true){
            for (int i = 1; i <=numbers ; i++) {
                System.out.println("What is the "+i+". number?");
                sum+=scan.nextInt();
                if(numbers==i){

                }
            }
            System.out.println("Do you want continue?");
            answer=scan.next();


            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid answer, Please enter yes or no");
                answer=scan.nextLine();
            }
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Your sum is "+sum);
                sum=0;
                System.out.println("How many numbers do you want to sum?");
                numbers=scan.nextInt();
                continue;
            }
            else if(answer.equalsIgnoreCase("no")){
                break;
            }
        }
        System.out.println("Your sum is "+sum);

















    }}
        /*
        for (int i= 0; i<=6; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }}











        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the sentence?");
        String sentence = scan.nextLine();
        System.out.println("What is the character?");
        String ch = scan.next();
        int count=0;
        for (int i = 0; i <sentence.length() ; i++) {
            if(sentence.charAt(i)==ch.charAt(0)){
               count++;
            }

        }
        System.out.println(count);

    }}













        /*
        int x=scan.nextInt();
        String a="";
        String word="";
        Random r= new Random();
        char c;

        for (int i = 0; i <x; i++) {
            while(true) {
                c = (char)(52+ r.nextInt(47));
                System.out.println("is " + (i+1) + " word " + c + "?");
                a=scan.nextLine();
                if(a.equalsIgnoreCase("yes")){
                    word+=c;
                    break;
                }
            }


        }
        System.out.println(word);
    }}

       /* int x,y,count=0,remainder=0;;
        x=scan.nextInt();
        y=scan.nextInt();

        while(x>=y){
            count++;
            x=x-y;


        }
        remainder=x;
        System.out.println(count+" with a remainder of "+remainder);











        /*  int i=5;
        int x=0,max=-9999999,min=999999;
        while(i>0){
            System.out.println("Enter a number");
            x=scan.nextInt();
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
            i--;
        }
        System.out.println("Max number is:"+max);
        System.out.println("Min number is:"+min);*/


