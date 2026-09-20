public class Food_Delivery {
public static void main(String[] args) {
    String status="Preparing";
    do{
        if(status.equals("Preparing")){
        System.out.println("Order is being prepared");
        status="Delivered";
        }
    }
    while(status.equals("Delivered"));
    System.out.println("order delivered");

}
}
