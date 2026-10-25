package PatternClasses;
import java.util.regex.*;
import java.util.Scanner;

public class Problem9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input digit");
        String input=sc.nextLine();
        Pattern p=Pattern.compile("[0-9]{4}");
        Matcher m=p.matcher(input);
        System.out.println(m.matches());


    }
    
}
