import java.util.regex.*;
public class Problem13{
    public static void main(String[] args) {
        String name="Hello  ";
        Pattern p=Pattern.compile("\\s");
        Matcher m=p.matcher(name);
        while(m.find()){
System.out.println("Space found: [" + m.group() + "]");

            
        }
    }
}