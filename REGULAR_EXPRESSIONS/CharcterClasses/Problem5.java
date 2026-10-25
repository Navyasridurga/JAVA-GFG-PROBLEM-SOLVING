import java.util.regex.*;
import java.util.Scanner;
public class Problem5{
    public static void main(String args[]){
       
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a pin");
            String s=sc.next();
            Pattern p=Pattern.compile("^[A-Z][A-Za-z0-9]*[0-9]$");
            Matcher m=p.matcher(s);
            if(m.find()){
                System.out.println(m.matches());
            }
            else{
                System.out.println("no match");
            }
        sc.close();
        }
    }
