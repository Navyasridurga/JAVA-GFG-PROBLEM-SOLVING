import java.util.regex.*;
import java.util.Scanner;
public class Product{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product code");
        String prodcode=sc.next();
        Pattern p=Pattern.compile("PROD[0-9]{4}");
        Matcher m=p.matcher(prodcode);
    if(m.matches()){
        System.out.println("ok");
    }
    else{
        System.out.println("no");
    }

    System.out.println(m.matches());


    }
}