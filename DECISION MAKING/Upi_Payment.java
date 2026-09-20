class Upi_Payment{
    public static void main(String[] args) {
        double balance=500;
        double amount=3500;
        boolean pinCorrect=true;
        if(pinCorrect){
            if(balance>amount){
                System.out.println("Insufficient Balance");
            }
        
        else{
           System.out.println("Payment Sucessful");
        }

    }
    }
}