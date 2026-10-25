package PatternClasses.MatcherClasses;
import java.util.regex.*;
public class Problem4 {
    public static void main(String[] args) {
        String input="Navya123Sri234Durga123";
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(input);
        while(m.find()){
            System.out.println("Number:"+m.group()+ "Length"+m.group().length());
        }
    }

    
}
