package day39_tasks;

public class Bank {
    public Bank(String accountHolder, int accountNumber, double balance) {
        AccountHolder = accountHolder;
        AccountNumber = accountNumber;
        this.balance = balance;
    }

    /*
    Warmup tasks:
      Task1
        create a custom class for BankAccount
            attributes/data that can have are:
                    1. AccountHolder, 2. AccountNumber, 3. Balance
              Actions: showBalance, deposit, withdraw
              requiremnts:
                1. user should be able to deposit money into their account
                2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                    2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
                3. user should be able to see their balance
     */
    String AccountHolder;
    int AccountNumber;
    double balance;

    @Override
    public String toString() {
        return "Apple Bank" +
                "AccountHolder='" + AccountHolder + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", balance=" + balance +
                '}';
    }

    public void showBalance(){
        System.out.println("Account name: "+AccountHolder);
        System.out.println("Account number: "+AccountNumber);
        System.out.println("Balance: "+balance);

    }
    public void deposit(double deposit){
        this.balance+=deposit;
    }
    public void withdraw(double withdraw){
        if(this.balance>0){
            if(this.balance<withdraw){
                balance-=35+withdraw;
            }
       // this.balance-=withdraw;
        }
        else{
            System.out.println("There is no suffiencent funds");
        }
    }
    public void getBalance(){
        System.out.println("Your balannce is "+this.balance);
    }
}
