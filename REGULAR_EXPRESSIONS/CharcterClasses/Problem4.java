import java.util.regex.*;
public class  Problem4{
    public static void main(String args[]){
        String code="java is easy";
        Pattern p=Pattern.compile("java$");
        Matcher m=p.matcher(code);
        System.out.println(m.find());

    }
}
