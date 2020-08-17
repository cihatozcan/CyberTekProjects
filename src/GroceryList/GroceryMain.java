package GroceryList;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GroceryList tomThumb = new GroceryList();
        System.out.println("How many items in the list?");
        int size=scan.nextInt();
        for (int i = 0; i <size ; i++) {
            System.out.println((i+1)+ ". Items name,quantity,price? ");
            String name=scan.next();
            int quantity = scan.nextInt();
            double price = scan.nextDouble();
            GroceryItemOrder item = new GroceryItemOrder(name,quantity,price);
           tomThumb.add(item);
        }
        System.out.println(tomThumb.getList(0).isVegetable());
        for (int i = 0; i < tomThumb.getI() ; i++) {
            System.out.println(tomThumb.getList(i).name);
        }
        System.out.println("Total cost:"+tomThumb.getTotalCost());
    }
}
