public class Onilen_Shopping {
    public static void main(String[] args) {
        double cartValue=2500;
        boolean couponApplied=true;
        if(cartValue>=2000){
            System.out.println("free delivery");
            if(couponApplied){
                System.out.println("Additional Discount");
            }
        }
        else{
        System.out.println("Normal order");
        }
    }
    
}
