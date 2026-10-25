package PatternClasses;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;

public class Problem5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        String  input=sc.nextLine();
        Pattern p=Pattern.compile(" ");
    
        String []words=p.split(input);
        for(String word:words){
            System.out.println(word);
        }

    }
    
}
