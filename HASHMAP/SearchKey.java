import java.util.*;
public class SearchKey{
    public static void main(String args[]){
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(101,"navya");
         hm.put(101,"Navya");
        hm.put(102,"ravi");
        hm.put(103,"kiran");
        if(hm.containsKey(101)){
            System.out.println(hm.get(101));
        }
        else{
            System.out.println("Employee not found");
        }
    }
}