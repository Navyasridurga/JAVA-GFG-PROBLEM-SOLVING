package PatternClasses.MatcherClasses;
import java.util.regex.*;
public class Problem7{
    public static void main(String args[]){
        String input="Java123SQL456";
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(input);
            while(m.find()){
                System.out.println(m.start());
                System.out.println(m.end());
                System.out.println(m.group());
                System.out.println(m.groupCount());
            }
        }
    }
