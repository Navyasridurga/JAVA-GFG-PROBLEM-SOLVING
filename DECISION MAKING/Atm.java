public class Atm {
    public static void main(String[] args) {
        int pin=1230;
        int balance=50000;
        int amount=2000;
        if(pin==1234){
            if(amount<=balance){
                System.out.println("Transaction SUCCESSFUL");
            }
        }
        else{
            System.out.println("in valid transaction");
        }
    }
    
}
