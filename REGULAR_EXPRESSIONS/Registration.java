import java.util.regex.*;
import java.util.Scanner;
public class Registration{
    public static void main(String args[]){
                System.out.println("enter your phone number");
        Scanner sc=new Scanner(System.in);
        String phone=sc.next();

        Pattern p=Pattern.compile("[0-9]{10}");
        Matcher m=p.matcher(phone);
        System.out.println(m.matches());
        
    }
}