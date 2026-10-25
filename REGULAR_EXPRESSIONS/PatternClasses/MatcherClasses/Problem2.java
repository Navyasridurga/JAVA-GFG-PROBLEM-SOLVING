package PatternClasses.MatcherClasses;
import java.util.regex.*;

public class Problem2 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher("NavyaSri12344durga3546");
        while(m.find()){
            System.out.println(m.group());
        }
    }
    
}
