import java.util.regex.*;
public class Problem2{
    public static void  main(String args[]){
        Pattern p=Pattern.compile("(java)\\d");
        Matcher m=p.matcher("java5");
        if(m.find()){
            System.out.println(m.group());
            System.out.println(m.groupCount());
            System.out.println(m.hitEnd());
            System.out.println(m.requireEnd());


        }
    }
}