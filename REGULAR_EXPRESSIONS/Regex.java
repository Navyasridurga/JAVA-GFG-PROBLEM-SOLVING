import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        String text = "9676270890";
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m = p.matcher(text);
        System.out.println(m.matches());
        
    }

}
