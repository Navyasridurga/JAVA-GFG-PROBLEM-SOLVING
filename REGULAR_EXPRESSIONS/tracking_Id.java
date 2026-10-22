import java.util.regex.*;
import java.util.Scanner;
public class tracking_Id{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ID");
        String tracking_Id=sc.next();
        Pattern p=Pattern.compile("PKG[0-9]{5}");
        Matcher m=p.matcher(tracking_Id);
        System.out.println(p);
        System.out.println(m.matches());
        System.out.println(p.flags());
        if(m.matches()){
            System.out.println("enter the office");
        }
        else{
            System.out.println("not allowed");
        }
    }

}