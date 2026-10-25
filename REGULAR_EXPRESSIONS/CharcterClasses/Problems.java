import java.util.regex.*;
public class Problems{
    public static void main(String[] args) {
        String code="A1B";
        Pattern p=Pattern.compile("A.B");
        Matcher m=p.matcher(code);
        System.out.println(m.matches());
    }
}