package app;

import company.Payment;

public class Main {

    public  static void main(String args[]){
        Upi u1=new Upi();
        u1.pay();
        System.out.println(Payment.payment_Limit);
        u1.receipt();

    }

}
