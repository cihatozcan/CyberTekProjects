package TesTing;

import java.util.Random;
import java.util.Scanner;

public class Fencepost_Algorithms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(vowels('b'));







       /* int num,max=-99999,min=99999;
        System.out.println("Type a number (or -1 to stop)");
        num=sc.nextInt();
        while(num!=-1){
            if(num>max){
                max=num;
            }
            else if(min>num){
                min=num;

            }
            System.out.println("Type a number (or -1 to stop)");
            num=sc.nextInt();


        }
        System.out.println("max:"+max+"\tmin:"+min);*/

    }
    public static void doWhile(){
        Scanner console = new Scanner(System.in);
        String sentece=console.nextLine();
        String a;
        do{
            System.out.println(sentece);
            System.out.println("Do you want to hear it agan?");
            a=console.next();
        }while(a.equals("y"));
    }
    public static void randomNumbers( ){
        Random r = new Random();
        int x;
        for(int i=0;i<10;i++){
            x=r.nextInt(50)+49;
            if(x%2!=0){
            System.out.println(x+", ");
            }

        }
    }
    public static void numbersFence(int x){
        System.out.print(1);
        for(int i=2;i<x;i++){
            System.out.print(", "+ i);
        }
        System.out.println();
    }
    public static void lettersFence(String a){
        System.out.print(a.charAt(0));
        for (int i=1;i<a.length();i++){
            System.out.print(", "+a.charAt(i));
        }
        System.out.println();
    }
    public static void wordsFence(String b){
        Scanner console = new Scanner(b);
        System.out.print(console.next());
        while(console.hasNext()){
            System.out.print(" and "+console.next());
        }
    }
    public static void mediumSentiel(){
        Scanner console = new Scanner(System.in);
        int num,sum=0;
        //half of the loop
        System.out.println("What is the  number//0 for exit");
        num=console.nextInt();
        sum+=num;
        while(num!=0){

            System.out.println("What is the number//0 for exit");
            num=console.nextInt();

        }
        System.out.println(sum);
    }
    public  static int zeroDigits(){
        Scanner console = new Scanner(System.in);
        System.out.println("Give me the number and I will tell you how many 0's it has!");
        int x=console.nextInt();
        int count=0;
        do{
            if(x%10==0){
                count++;
            }
            x=x/10;


        }while(x>1);
        return count;

    }
    public static void randomRepeat(){
        Random r = new Random();
        int x;

        do{
            x=r.nextInt(1000)+1;
            System.out.println("Random number :"+x);
        }while(x<900);
    }
    public static boolean vowels(char a){

        if(a=='a'||a=='e'||a=='u'||a=='o'||a=='i'){
            return  true;
        }
        else{
            return false;
        }
    }
}
