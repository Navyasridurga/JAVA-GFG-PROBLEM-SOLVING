package app1;
import product.Product;

public class Main  {
    
    public static void main(String args[]){
         Product p1=new Product("Laptop",12300,"things",101);
         p1.showProduct();
         p1.showPrice();
         p1.showCategory();
         p1.showProductId();


    }

}
