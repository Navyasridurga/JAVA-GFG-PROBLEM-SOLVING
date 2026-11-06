import java.util.regex.*;
public class RemoveDuplicates {
    public static String removeDuplicate(String input){
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(input);
        while(m.find()){
           input=input.replaceAll(m.group(),m.group(1));
        }
        return input;
    }
    public static void main(String args[]){
        String str1="Good bye bye world world";
        System.out.println(removeDuplicate(str1));
    }
    
}
