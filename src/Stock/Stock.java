package Stock;

public class Stock {
    /*
    Prompt the user for each stock's symbol and store the information somewhere.
Prompt the user for the number of purchases of each stock.
Read each purchase (number of shares and price per share) from the console and store the information somewhere.
Compute the total profit/loss of each stock.
Print the total profit/loss of each stock to the console.
Compare the two total profits/losses and print a message to the console about which stock performed better.
     */
    private String symbol;
    private int totalShares;
    private double totalCost;

    /**
     * construct new object with Symbol
     * @param theSymbol
     */
    public Stock(String theSymbol){   // constructor of the class
        if(theSymbol==null){
            throw new NullPointerException();
        }
        this.symbol=theSymbol;
        this.totalShares=0;
        this.totalCost=0.0;
    }

    /**
     * add new shares and prices to instance object.
     * @param shares
     * @param pricesPerShare
     */
    public void purchase(int shares,double pricesPerShare){
        if(shares<0 || pricesPerShare<0){
            throw new IllegalArgumentException();
        }
        this.totalShares+=shares;
        this.totalCost+=shares*pricesPerShare;
    }

    /**
     * gets the current profit
     * @param currentPrice
     * @return
     */
    public double getProfit(double currentPrice){
        if(currentPrice<0.0){
            throw new IllegalArgumentException();
        }
        return totalShares*currentPrice-totalCost;
    }
}
