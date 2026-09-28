import java.util.Scanner;
public class Payment_Method {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter payment method");
        String user=sc.next();
        if(user.equals("UPI")||user.equals("CARD")||user.equals("CASH")){
            System.out.println("Processing Card Payment");

        }
        else{
            System.out.println("Invalid payment method");
        }


    }
    
}
