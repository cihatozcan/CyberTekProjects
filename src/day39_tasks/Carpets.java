package day39_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Carpets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Carpet> arr= new ArrayList<>();
        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        arr.add(carpet1);
        arr.add(carpet2);
        arr.add(carpet3);
        int count=0;
        for(Carpet each:arr) {
            count++;
            System.out.println("What is the"+count+". carpet width?");
            each.width=scan.nextDouble();
            System.out.println("What is the"+count+". carpet length?");
            each.length=scan.nextDouble();
            System.out.println("What is the"+count+". carpet Unitprice?");
            each.unitPrice=scan.nextDouble();
            System.out.println("What is the"+count+". carpet is Persian?");
            each.isPersian=scan.nextBoolean();
            each.getCarpetInfo();

        }
        for(Carpet each:arr){
            each.getCarpetInfo();
            System.out.print("  Price is "+each.CalcCost()+"$");
        }
    }
}
