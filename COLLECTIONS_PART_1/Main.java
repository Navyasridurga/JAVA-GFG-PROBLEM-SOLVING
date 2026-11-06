import java.util.*;


public class Main {
    public static void main(String args[]){
        List<String> names=new ArrayList<>();
        List<String> syncList=Collections.synchronizedList(names);
        syncList.add("navya");
        syncList.add("ravi");
        syncList.add("krishna");
        System.out.println(syncList);
    }
    

}
