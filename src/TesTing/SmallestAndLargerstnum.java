package TesTing;

import java.util.Scanner;

public class SmallestAndLargerstnum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int secim =console.nextInt();


        String day =(secim==1)?"Monday":(secim==2)?"Tuesday":(secim==3)?"Wednesday":(secim==4)?"Thursday":(secim==5)?"Friday":
                (secim==6)?"Saturday":(secim==7)?"Sunday":"invalid";
        System.out.println(day);

    }
    public static void SandLnum(int size){
        Scanner console= new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        size=console.nextInt();
        int max = -99999,min = 9999,x=0,y=0,min1=0,max1=0;



        for(int i=1;i<=size;i++){
            System.out.println("Number"+i);
           x=console.nextInt();
           y+=x;




        }
        System.out.println(min+" "+max);
    }
}
