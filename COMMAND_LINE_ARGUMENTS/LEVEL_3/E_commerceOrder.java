public class E_commerceOrder {
    public static void main(String[] args) {
        String customer_name=args[0];
        String productName=args[1];
        int price=Integer.valueOf(50000);
        int quantity=Integer.valueOf(2);
        int total=price*quantity;
        System.out.println("Cusotmer:"+customer_name);
        System.out.println("Procudct Name:"+productName);
        System.out.println("Quantity:"+(quantity));
        System.out.println("Total:"+total);



    }
    
}
