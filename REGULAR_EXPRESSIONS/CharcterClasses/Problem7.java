import java.util.regex.*;
import java.util.Scanner;
public class Problem7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        Pattern p=Pattern.compile("a*c");
        Matcher m=p.matcher(s);
        System.out.println(m.matches());

sc.close();
    }
    
  
}
