import java.util.Scanner;
public class Atm_Pin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int pin=1234;
        int user;

        do{
               System.out.println("enter a pin number");
         user=sc.nextInt();
           if(pin==user){
            System.out.println("succesful");
           }
           else{
           
            System.out.println("Try again");
            System.out.println("Wrong pin");
            }
        }
             while(user!=pin);
        
        }
    }
        
        
    
    
        
    
    