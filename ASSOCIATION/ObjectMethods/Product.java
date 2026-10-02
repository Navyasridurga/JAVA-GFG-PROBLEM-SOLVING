package ObjectMethods;

public class Product {
    int productId;
    String productName;
    int price;
    Product(int productId,String productName,int price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;

    }
    @Override
    public String toString(){
        return productId+""+productName+" "+price;

    }
    public static void main(String args[]){
        Product p=new Product(101,"mobile",15000);
        System.out.println(p.toString());

    }


}
