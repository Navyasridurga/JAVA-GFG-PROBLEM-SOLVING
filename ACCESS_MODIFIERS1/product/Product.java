package product;

public class Product {
    public String productName;
    protected int price;
     String category;
    private int productId;
  public Product(String productName,int price,String category,int productId){
        this.productName=productName;
        this.price=price;
        this.category=category;
        this.productId=productId;
    }
    
//    public  void displayProduct(){
//         System.out.println(productName);
//         System.out.println(productId);
//         System.out.println(category);
//         System.out.println(price);
    
//     }
    
  
    public void showProduct(){
        System.out.println("Product:"+productName);

    }
    protected void showPrice(){
        System.out.println("price:"+price);

    }
    void showCategory(){
        System.out.println("Category:"+category);

    }
    public void setProductId(int productId){
        this.productId=productId;
    }

   
    public int getProductId(){
        return productId;
    }
public static void main(String args[]){
   Product p1=new Product("laptop", 1230000, "study", 123);
    p1.showCategory();
    p1.showPrice();
    p1.showProduct();
    int result=p1.getProductId();
    System.out.println(result);
}
}
