package day39_tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bank> arr=new ArrayList<>();
        Bank account1 = new Bank("FelicityStarbard",12345,500);
        Bank account2 = new Bank("Cihatozcan",1234,450);
        Bank account3 = new Bank("CharleenStarbard",123,400);
        arr.add(account1);
        arr.add(account2);
        arr.add(account3);
        int countforAccount=0;
        while(3>countforAccount) {

            System.out.println("What is your accname?");
            String x = scan.next();
            System.out.println("What is the account number?");
            int y = scan.nextInt();
            boolean result = true;
            int count = 0;
            for (Bank each : arr) {
                if (each.AccountNumber == y && each.AccountHolder.equalsIgnoreCase(x)) {
                    count++;
                    while (result) {
                        System.out.println("1. withdraw money");
                        System.out.println("2. deposit money");
                        System.out.println("3. show balance");
                        System.out.println("4. exit");
                        int z = scan.nextInt();
                        switch (z) {
                            case 1:
                                System.out.println("How much want to withdraw?");
                                double a = scan.nextDouble();
                                each.withdraw(a);
                                break;
                            case 2:
                                System.out.println("How much want to deposit");
                                double b = scan.nextDouble();
                                each.deposit(b);
                                break;
                            case 3:
                                each.getBalance();
                                break;
                            case 4:
                                result = false;
                                break;
                        }


                    }
                }
            }
            if (count != 1) {
                System.out.println("Invalid Acc");
                countforAccount++;
                System.out.println(countforAccount+". attempt unsuccessfull ");

            }

        }
        System.out.println("You have to wait 30 min to process again");
    }
}
