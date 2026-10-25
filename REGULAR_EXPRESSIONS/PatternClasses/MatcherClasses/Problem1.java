package PatternClasses.MatcherClasses;
import java.util.regex.*;
import java.util.Scanner;
public class Problem1 {
    public static void main(String args[]){
        String input="Navya123SriDurga";
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(input);
        while(m.find()){
            System.out.println(m.start());

            System.out.println(m.group());
            System.out.println(m.end());
        }
    }
    
}
