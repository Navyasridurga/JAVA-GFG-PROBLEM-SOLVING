import java.util.regex.*;
public class Pratice1{
    public static void main(String args[]){
        String num="98765";
        Pattern p=Pattern.compile("[0-9]{7}");
        Matcher m=p.matcher(num);
        System.out.println(m.matches());
        
    }
}