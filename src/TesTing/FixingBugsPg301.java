package TesTing;

import java.util.Scanner;

public class FixingBugsPg301 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How much will John be spending");
        double amount=console.nextDouble();
        int NumBills=moneyCal(amount);
        System.out.println("How much will Jane be spending?");
        amount=console.nextDouble();
        int numBills2=moneyCal(amount);
        result(NumBills,numBills2);

    }
    public static int moneyCal(double amount){//Calculates How many bills the person have.
        return (int)amount/20;

    }
    public static void result(int NumBills,int numBills2){ // Write in console How much bills they need for spending.
        System.out.println("John needs "+ NumBills + " bills");
        System.out.println("Jane needs "+ numBills2+ " bills");
    }

}
