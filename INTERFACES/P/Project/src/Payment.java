public interface Payment {
    abstract void pay();

}
class Upi implements Payment{
    @Override 
   public  void pay(){
        System.out.println("Payment is running");
    }

}
 class Main{
    public static void main(String args[]){
        Upi u1=new Upi();
        u1.pay();
    
    }
 }
