package Stock;

import java.util.Scanner;

/*
rite a class named GroceryList that represents a list of items to buy from
the market, and another class named GroceryItemOrder that represents a request to purchase
 a particular item in a given quantity (e.g., four boxes of cookies). The GroceryList
 class should use an array field to store the grocery items and to keep track of its size
  (number of items in the list so far). Assume that a grocery list will have no more than
   10 items. A GroceryList object should have the following methods:
   public GroceryList()
Constructs a new empty grocery list.
   public void add(GroceryItemOrder item)
Adds the given item order to this list if the list has fewer than 10 items.
   public double getTotalCost()
Returns the total sum cost of all grocery item orders in this list.
The GroceryItemOrder class should store an item quantity and a price per unit. A GroceryItemOrder object should have the following methods:
   public GroceryItemOrder(String name, int quantity, double pricePerUnit)
Constructs an item order to purchase the item with the given name, in the given quantity, which costs the given price per unit.
   public double getCost()
Returns the total cost of this item in its given quantity. For example, four
boxes of cookies that cost 2.30 per unit have a total cost of 9.20.
public void setQuantity(int quantity)
Sets this grocery item's quantity to be the given value.
 */
public class StockMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //first stock
        System.out.println("First stock's symbol");
        String symbol1 = console.next();
        Stock stock1 = new Stock(symbol1);
        double profit1 = makePurchases(stock1,console);

        //second stock
        System.out.println("Second stock's symbol: ");
        String symbol2 = console.next();
        Stock stock2= new Stock(symbol2);
        double profit2 = makePurchases(stock2,console);

        //report which stock made more money

        if(profit1>profit2){
            System.out.println(symbol1+" is more profitable");
        }
        else if(profit2>profit1){
            System.out.println(symbol2+" is more profitable");
        }
        else{
            System.out.println("They are equally profitable.");
        }

    }
    //make purchases of stock and return the profit
    public static double makePurchases(Stock currentStock, Scanner console){
        System.out.println("How many purchases did you make? ");
        int numPurchases = console.nextInt();

        // ask about each purchase
        for (int i = 1; i <= numPurchases ; i++) {
            System.out.println(i+": How many shares, at what price per share? ");
            int numShares =console.nextInt();    //181 shares
            double pricePerShare = console.nextDouble(); //2.50
            //ask the Stock object to record this purchase
            currentStock.purchase(numShares,pricePerShare);
        }
        // use the Stock object to compute profit
        System.out.println("What is today's price per share? ");
        double currentPrice = console.nextDouble();

        double profit = currentStock.getProfit(currentPrice);
        System.out.println("Net profit/loss: $"+ profit);
        System.out.println();
        return profit;

    }
}
