@FunctionalInterface
interface Payment {
    void pay();

    
}

class Main {
    public static void main(String args[]) {
        Payment p = () -> {
            System.out.println("Payment successful");
        };
      
        p.pay();
        

    }
}