package PatternClasses;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Problem4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input");
        String input=sc.next();
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(input);
        System.out.println(m.matches());
    }
    
}
