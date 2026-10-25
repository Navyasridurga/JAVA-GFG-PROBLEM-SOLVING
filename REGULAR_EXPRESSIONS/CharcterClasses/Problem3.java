 import java.util.regex.*;
 public class Problem3{
    public static void main(String arsg[]){
        String prod="ITEM234";
        Pattern p=Pattern.compile("PROD");
        Matcher m=p.matcher(prod);
        System.out.println(m.find());
    }
 }