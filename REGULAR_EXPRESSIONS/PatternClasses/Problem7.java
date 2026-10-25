package PatternClasses;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Pattern p=Pattern.compile(",");
        String words[]=p.split(input);
        for(String word:words){
            System.out.println(word);
        }
    }
    
}
