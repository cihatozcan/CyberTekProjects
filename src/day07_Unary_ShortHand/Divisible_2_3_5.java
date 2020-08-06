package day07_Unary_ShortHand;

import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Divisible_2_3_5 {


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int x=3;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


        while(x>0) {
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            System.out.println("What is user name");
            String name = scanner.next();
            System.out.println("What is password");
            int password = scanner.nextInt();
            if (admin(name,password)) {
                while(true) {
                    System.out.println("Password correct");

                    System.out.println(dtf.format(now) + " tarihinde giris yapildi");
                    System.out.println("1. Minumum Deger Alma");
                    System.out.println("2. Iki nokta arasindaki uzaklik");
                    System.out.println("3. Diamond almak");
                    System.out.println("4. Cikis");
                    int secim = scanner.nextInt();
                    int y, z, t,k;

                    if(secim==1) {
                        System.out.println("1. rakami giriniz");
                        y = scanner.nextInt();
                        System.out.println("2. rakami giriniz");
                        z = scanner.nextInt();
                        System.out.println("3. rakami giriniz");
                        t = scanner.nextInt();
                        System.out.println("Minimum deger: " + MinimumDeger(y, z, t));
                    }

                       else if (secim==2) {
                        System.out.println("x1 i giriniz");
                        y = scanner.nextInt();
                        System.out.println("y1 i girininiz");
                        z = scanner.nextInt();
                        System.out.println("x2 yi giriniz");
                        t = scanner.nextInt();
                        System.out.println("y2 yi giriniz");
                        k = scanner.nextInt();
                        System.out.println("Distance: " + Distancebetweentwopoints(y, z, t, k));

                    }
                       else if(secim==3){
                            Diamond(5);

                       }

                    }

                }

            else{
                System.out.println("Password inccorect");
            }

            x--;
            System.out.println(x+" times left to try the password");

        }


    }
    public static boolean admin(String name,int password){

        String username="Cihat";
        int pwd=1234;
        if(name.equals(username) &&password==pwd){
            return true;
        }
        else {
            return false;
        }
    }






    public static void tekraredici(String sentence, int number){
        for(int i=1;i<=number;i++){
            System.out.println(sentence);

        }
    }
    public static int countQuartes(int cents){
        return (int)(cents%100/25);
    }
    public static double DikdortgeninAlanHesaplama(int x, int y){
        return x*y;
    }
    public static double KareninAlani(double x){
        return Math.pow(x,2);
    }
    public static double Hipotenus(int kisakenar,int uzunkenar){

        return Math.sqrt((Math.pow(kisakenar,2)+Math.pow(uzunkenar,2)));
    }
    public static double Distancebetweentwopoints(double x1,double y1,double x2, double y2){

        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
    public static void Kareyazmak(int x){
        for(int i=1;i<=x;i++) {
            for(int k=1;k<=x;k++){
                System.out.print("*");
            }
            System.out.println();
        }





    }
    public static int MinimumDeger(int x ,int y, int z){
        return Math.min(x,Math.min(y,z));

    }
    public static void Diamond(int number) {
        for (int i = 1; i <= number; i++) {
            for (int k = 1; k <= number - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int x = 1; x <= number * 2 - 1; x++) {
                System.out.print('a');
                for (int z = 1; z <= number - x; z++) ;
                System.out.print('b');
            }
            System.out.println();
        }
    }


}

