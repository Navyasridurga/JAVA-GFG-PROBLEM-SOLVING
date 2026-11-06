public class Product <T,U,V>{
    private  T productId ;
    private  U productName  ;
    private V productPrice ;
    public Product(T productId,U productName, V productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }
    public void setproductId(T productId){
        this.productId=productId;

    }
    public void setproductName(U productName){
        this.productName=productName;
    }
    public void setproductPrice(V productPrice){
        this.productPrice=productPrice;
    }
    public  T getproductId(){
        return  productId;

    }
    public U getproductName(){
        return productName;
    }
    public  V getproductPrice(){
        return productPrice;
    }
    public void displayDetails(){
        System.out.println("ProductId:"+productId);
        System.out.println("ProductName:"+productName);
        System.out.println("Productprice:"+productPrice);
    }
    
}
class Main3{
    public static void main(String args[]){
        Product<Integer,String,Float>p1=new Product<>(101,"Laptop",55000.0f);
        Product<String,String,Integer> p2=new Product<>("PR202","Mouse",750);
        p1.displayDetails();
        p2.displayDetails();
    }
}
