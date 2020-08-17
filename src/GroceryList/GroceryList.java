package GroceryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    /*
    Write a class named GroceryList that represents a list of items
    to buy from the market, and another class named GroceryItemOrder
     that represents a request to purchase a particular item in a given quantity
     (e.g., four boxes of cookies). The GroceryList class should use an array field
     to store the grocery items and to keep track of its size (number of items in the list so far)
     . Assume that a grocery list will have no more than 10 items. A GroceryList object should
     have the following methods:
     */
    GroceryItemOrder[] grocery= new GroceryItemOrder[10000000]; //Array field name initilazied to 10;
    int i=0;//i=1,
   // {null,null,null,null,null,null,null,null,null}
   // {int itemquantity;
    //    String name;
    //    double price;,

    /**
     * gets the index number
     * @return
     */
    public int getI() {
        return i;
    }

    /**
     * empty constructor
     */
    public GroceryList(){
    }

    /**
     * adds items to list which initilazed in the begining of this class to size 10
     * @param item
     */
    public void add(GroceryItemOrder item){
      this.grocery[i]=item;
      i++;
    }

    /**
     * sums the prices of items in the list
     * @return
     */
    public double getTotalCost(){
        double total=0;
        for (int k= 0; k <this.getI(); k++) {
            total+=this.grocery[k].getCost();
        }
        return total;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "grocery=" + Arrays.toString(grocery)
                ;
    }
    public GroceryItemOrder getList(int i){
        return grocery[i];
    }
}
