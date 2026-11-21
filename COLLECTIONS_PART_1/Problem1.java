import java.util.*;
public class Problem1{
    public static void main(String args[]){
        List<String>list=Collections.synchronizedList(new ArrayList<>());
        list.add("java");
        list.add("python");
        list.add("c++");
        synchronized(list){
            for(String s:list){
                System.out.println(s);
            }
        }
    }
}