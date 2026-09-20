public class Food_Delivery {
    public static void main(String[] args) {
        double orderAmount=650;
        boolean restaurantOpen=true;
        if(restaurantOpen){
            if(orderAmount>=500){
                System.out.println("free delivery");
            }
            else if(orderAmount<500){
                System.out.println("Delivery Charges Apply");
            }
        }
    else{
        System.out.println("Restaurant Closed");
    }
}
    
}

