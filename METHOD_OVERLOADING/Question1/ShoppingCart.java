package Question1;

public class ShoppingCart {
    String itemName;
    int quantity;
    double price;
    double total;
    void addItem(String itemName){
        System.out.println("Laptop");
    }
    void addItem(String itemName,int quantity){
        System.out.println("Added:"+itemName);
        System.out.println("Quantity:"+quantity);
    }
    void addItem(String itemName,int quantity,double price){
        total=price*quantity;
        System.out.println("Added:"+itemName);
        System.out.println("Quantity:"+quantity);
        System.out.println("price:"+price);
        System.out.println("Total:"+total);
    }
    public static void main(String args[]){
    ShoppingCart s1=new ShoppingCart();
    s1.addItem("Laptop");
    s1.addItem("Laptop",2);
    s1.addItem("Laptop",2,34000);

    }
    
}
