package abstract1;

public abstract class Payment {
    abstract void pay();

}
class Upi extends Payment{
    void pay(){
        System.out.println("Payment done throught Upi");
    }
}
class Main{
    public static void main(String args[]){
        Upi u1=new Upi();
        u1.pay();
    }
}
