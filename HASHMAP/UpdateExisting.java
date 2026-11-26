import java.util.*;
public class UpdateExisting{
    public static void main(String args[]){
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"Java");
        hm.put(2,"Python");
        hm.put(3,"SQL");
        hm.put(2,"Javascript");
        System.out.println(hm);
        hm.remove(1);
        System.out.println(hm);
    }
}