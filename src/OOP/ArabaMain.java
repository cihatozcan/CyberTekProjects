package OOP;

import java.util.Scanner;

public class ArabaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Arabalar mercedes = new Arabalar(2005,"red",16);
        System.out.println(mercedes);
        System.out.println(mercedes.fiyatHesaplama());
        System.out.println("Is car works?T/F");
        boolean start=scan.nextBoolean();
        System.out.println(mercedes.start(start));


    }
}
