class Produ<T,U,V>{
    T productId;
    U productName;
    V productPrice;
    public Produ(T productId, U productName,V productPrice ){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }
    public void display(){
        System.out.println("product Id:"+productId);
        System.out.println("product Name:"+productName);
        System.out.println("productPrice:"+productPrice);

    }

}
public class Pro{
    public static void main(String args[]){
        Produ<Integer,String,Integer>p1=new Produ<>(101,"colgate",45);
        p1.display();
    }
}