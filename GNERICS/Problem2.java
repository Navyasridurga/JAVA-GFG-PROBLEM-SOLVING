import java.util.*;
public class Problem2{
    public static void main(String args[]){
        List<String>ls=new ArrayList<>();
        ls.add("navya");
        ls.add("sri");
        List<?>list=ls;
        System.out.println(list);
        ls.add("java");
        System.out.println(list);
    }
}