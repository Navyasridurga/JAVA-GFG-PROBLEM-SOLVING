import java.util.regex.*;
public class Problem10{
    public static void main(String[] args) {
        String name="navya1234";
        Pattern p=Pattern.compile("\\d");
        Matcher m=p.matcher(name);
        System.out.println(m.matches());
        while(m.find()){
            System.out.print(m.group());
        }

    }
}