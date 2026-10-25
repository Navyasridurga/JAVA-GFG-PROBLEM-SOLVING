
import java.util.regex.*;
import java.util.Scanner;
public class Problem9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
       String s=sc.next(); 
       Pattern p=Pattern.compile("[0-9]+");
       Matcher m=p.matcher(s);
       if(m.matches()){
        System.out.println(m.matches());
       }
       else{
        System.out.println(m.find());
       }
        {
            System.out.println(m.start());
        }
        sc.close();
       }

    }



