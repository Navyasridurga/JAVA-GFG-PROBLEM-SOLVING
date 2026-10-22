import java.util.regex.*;
import java.util.Scanner;
public class PhonePay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter pin");
        
         String pin=sc.next();
         Pattern p=Pattern.compile("[0-9]{4}");
         Matcher m=p.matcher(pin);
         if(m.matches()){
            System.out.println("successfully unlock");
         }
         else{
            System.out.println("tyr again");
         }


        
    }
    
}
