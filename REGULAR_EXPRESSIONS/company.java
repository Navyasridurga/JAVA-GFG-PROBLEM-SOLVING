import java.util.regex.*;
import java.util.Scanner;
public class company{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String  email=sc.next();
    Pattern p=Pattern.compile("[A-Z]{@comapny.com}");
    Matcher m=p.matcher(email);
   
    if(m.matches()){
        System.out.println(" than you for enter successfully");
    }
    else{
        System.out.println("not valid");
    }
}
}