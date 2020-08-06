package TesTing;

import java.util.Random;
import java.util.Scanner;

public class Show2s {
    public static void main(String[] args) {

       position();
    }
    public static void showTwos(int number){


        while(number%2==0){
            System.out.print("2 * ");
            number=number/2;
        }
        System.out.print(number);
    }
    public static void random(){
        double sayi=0;


        while(sayi<=16){
            sayi=Math.random()*(25-5+1)+5;
            sayi=Math.ceil(sayi);
            System.out.println(sayi);
            for(int i=1;i<=sayi;i++) {
                System.out.print("x");
            }
            System.out.println();


        }


    }
    public static void randomLines(){
        double length1=0;

            double length = Math.ceil(Math.random() * 6 + 5);


                for (int i = 1; i <= length; i++) {
                    length1 = (char) Math.ceil(Math.random() * 80);
                    for (char k = 'a'; k < 'z'; k++) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
            }

    public static void makeGuesses(){
        Scanner console = new Scanner(System.in);
        int guess=0;
        int count=0;
        while(guess<48){
            System.out.println("Make a guess");
            guess=console.nextInt();
            count++;
        }
        System.out.println("total guesses = "+count);


    }
    public static void diceSum(){
        Scanner console =new Scanner(System.in);
        int desiredsum=console.nextInt();
        double x=0;
        double y=0;
        while(x+y!=desiredsum){
            x=(int)Math.ceil(Math.random()*5+1);
            y=(int)Math.ceil(Math.random()*5+1);
            System.out.println(x+" and "+y+" = "+(x+y));
        }


    }
    public static void position(){
        Random random = new Random();
        int position=0,max=-3;
        boolean result ;
        while(position<3 && position>-3) {
            max=Math.max(position,max);
            result=random.nextBoolean();
            if (result){
                position++;
                System.out.println("position = "+position);
            }
            else{
                position--;
                System.out.println("position = "+position);

            }


        }
        System.out.println("max is "+max);

    }
}



