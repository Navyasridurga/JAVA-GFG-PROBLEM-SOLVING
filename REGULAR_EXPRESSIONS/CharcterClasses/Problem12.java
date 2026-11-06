import java.util.regex.*;


public class Problem12{
    public static void main(String[] args) {
        String name="Navya_123!";
        Pattern p=Pattern.compile("\\W");
        Matcher m=p.matcher(name);
        while(m.find()){
            System.out.print(m.group());
        }
    }
}