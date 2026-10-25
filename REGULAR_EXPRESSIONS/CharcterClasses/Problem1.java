import java.util.regex.*;
public class Problem1{
    public static void main(String args[]){
        String code="NMI";
        Pattern p=Pattern.compile("N.I");
        Matcher m=p.matcher(code);
        System.out.println(m.matches());

    }
    
}