public class Food_Delivery_Bill {
    int bill(int food_price,int quantity,int delivery_charge){
       int total_bill=quantity*food_price+delivery_charge;
        return total_bill;
    }
    public static void main(String arsg[]){
        Food_Delivery_Bill f1=new Food_Delivery_Bill();
        int result=f1.bill(230,4,120);
        System.out.println(result);
    }
    
}
