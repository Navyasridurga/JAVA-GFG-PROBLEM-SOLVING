package PatternClasses;
import java.util.regex.*;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String input=sc.next();
        System.out.println(Pattern.matches("[0-9]+",input));

    }

    
}
