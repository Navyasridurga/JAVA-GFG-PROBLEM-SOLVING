public class Product1{
    private String productName;
    private int price;
    Product1(String productName,int price){
        this.productName=productName;
        this.price=price;

    }
    void displayProduct(){
      System.out.println("product Name:"+productName);
      System.out.println("price:"+price);

    }
    public static void main(String args[]){
        Product1 p=new Product1("Laptop",50000);
        p.displayProduct();
    }
}
