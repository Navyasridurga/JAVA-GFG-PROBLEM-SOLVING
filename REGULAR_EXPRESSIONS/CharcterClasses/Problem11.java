import  java.util.regex.*;
public class Problem11{
    public static void main(String args[]){
        String name="Navya123";
        Pattern p=Pattern.compile("\\D");
        Matcher m=p.matcher(name);
        while(m.find()){
            System.out.print(m.group());
        }
    }
}