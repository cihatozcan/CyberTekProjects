package GroceryList;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GroceryList newlist = new GroceryList();
        GroceryItemOrder patates = new GroceryItemOrder("Patates",12,10);
        System.out.println(patates.getCost());
        System.out.println("How many items in the list?");
        int size=scan.nextInt();
        for (int i = 0; i <size ; i++) {
            System.out.println((i+1)+ ". Items name,quantity,price? ");
            String name=scan.next();
            int quantity = scan.nextInt();
            double price = scan.nextDouble();
            GroceryItemOrder item = new GroceryItemOrder(name,quantity,price);
            newlist.add(item);

        }
        newlist.getList(0).setQuantity(0);
        System.out.println("Total cost:"+newlist.getTotalCost());
    }
}
