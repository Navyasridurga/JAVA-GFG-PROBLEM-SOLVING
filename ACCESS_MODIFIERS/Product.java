public class Product {
    private  int price;
   void  showPrice(){

        System.out.println(price);
    }
    Product(int price){
        this.price=price;
    }
    public static void main(String args[]){
        Product pq=new Product(9000);
        pq.showPrice();
    }

    
}
