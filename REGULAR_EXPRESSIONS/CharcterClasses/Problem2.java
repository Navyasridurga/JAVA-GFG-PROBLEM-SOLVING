import java.util.regex.*;
public class Problem2 {
    public static void main(String args[]){
        String code="Navya";
        Pattern p=Pattern.compile("^N");
        Matcher m=p.matcher(code);
        System.out.println(m.find());
    }
    
}

