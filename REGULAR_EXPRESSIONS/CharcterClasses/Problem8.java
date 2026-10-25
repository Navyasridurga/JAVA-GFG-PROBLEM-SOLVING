import java.util.regex.*;
import java.util.Scanner;
public class Problem8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product name");
        String prod=sc.next();
        Pattern p=Pattern.compile("^PROD[A-Z]{2}-[0-9]{2,4}X?$");
        Matcher m=p.matcher(prod);
        System.out.println(m.matches());
        sc.close();
    }
}

