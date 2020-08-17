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
        int countAttemps=0;      //count the attemps of unvalid Acc
        while(3>countAttemps) {

            System.out.println("What is your accname?");
            String x = scan.next();
            System.out.println("What is the account number?");
            int y = scan.nextInt();
            boolean result = true;                           // Boolean for controlling while loop
            int count = 0;                                  // count if Accountname and password is found in the list
            for (Bank each : arr) {                         // this will loop every each account in the list
                if (each.AccountNumber == y && each.AccountHolder.equalsIgnoreCase(x)) {
                    count++;
                    while (result) { //this will keep continue the ask the user what they would like to do until they press 4
                        System.out.println("1. withdraw money");
                        System.out.println("2. deposit money");
                        System.out.println("3. show balance");
                        System.out.println("4. exit");
                        int z = scan.nextInt();
                        switch (z) {
                            case 1:
                                System.out.println("How much want to withdraw?");
                                double a = scan.nextDouble();
                                if(a>each.balance){
                                    System.out.println("Amount is greater than your balance. Penalty fee will be added" +
                                            "Do you wish to continue? T/F");//Early warning for penalty
                                    boolean w=scan.nextBoolean();
                                    if(w){
                                        each.withdraw(a);
                                    }
                                }else{
                                each.withdraw(a);
                                }
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
                countAttemps++;                                            //Count the invalid attempts
                System.out.println(countAttemps+". attempt unsuccessfull ");

            }

        }if(countAttemps==3) {
            System.out.println("You have to wait 30 min to process again"); //Reaches this line block if the count of attemps exceed 3
        }
    }
}
