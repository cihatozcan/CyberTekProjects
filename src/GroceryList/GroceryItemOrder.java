package GroceryList;

public class GroceryItemOrder {
    int itemquantity;
    String name;
    double price;

    public GroceryItemOrder(String name, int itemquantity, double price){
        this.name=name;
        this.itemquantity=itemquantity;
        this.price=price;
    }

    @Override
    public String toString() {
        return "GroceryItemOrder{" +
                "itemquantity=" + itemquantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public double getCost(){
        return this.price*this.itemquantity;
    }
    public void setQuantity(int quantity){
        this.itemquantity=quantity;
    }
    public boolean isVegetable(){
        if(this.name.equalsIgnoreCase("eggplant")||this.name.equalsIgnoreCase("patatoes")){
            return true;
        }
       return false;
    }
}
