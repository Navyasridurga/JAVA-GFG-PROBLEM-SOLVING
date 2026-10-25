package PatternClasses.MatcherClasses;
import java.util.regex.*;
public class Problem3 {
    public static void main(String args[]){
        int count=0;
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher("A12B345C6D78");
while(m.find()){
    count++;

}
System.out.println(count);
    }
    
}
