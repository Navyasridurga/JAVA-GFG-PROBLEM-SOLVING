package Vehicle;

public class Payment {
    void pay(){
        
    }
    
}

class Upi extends Payment{
    void scanQR(){

    }
}

class Card extends Upi{
    void swipeCard(){

    }
    public static void main(String args[]){
        Payment p=new Payment();
        System.out.println(p instanceof Payment);
        System.out.println(p instanceof Upi);
        System.out.println(p instanceof Card);
    
}
}
