package PatternClasses;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem1 {
    public static void  main(String args[]){
        String number="1234";
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(number);
        System.out.println(m.matches());
    }
}
