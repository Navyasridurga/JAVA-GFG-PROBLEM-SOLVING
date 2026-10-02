package ObjectMethods;

public class Package1 {
    int productId;
    String productName;
    int price;
    Package1(int productId,String productName,int price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    @Override
    public  boolean equals(Object obj){
    Package1 other=(Package1)(obj);
    return this.productId==other.productId;
    } 
    public static void main(String args[]){
        Package1 p1=new Package1(121, "the rise", 190);
        Package1 p2=new Package1(121,"HE IS ", 012);
        System.out.println(p1.equals(p2));
    }


}
