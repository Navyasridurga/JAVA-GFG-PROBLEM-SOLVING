package PatternClasses;
import java.util.regex.*;
import java.util.Scanner;
public class Problem3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        String input=sc.next();
        Pattern p=Pattern.compile("[A-Z]+");
        Matcher m=p.matcher(input);
        System.out.println(m.matches());



    }
    
}
