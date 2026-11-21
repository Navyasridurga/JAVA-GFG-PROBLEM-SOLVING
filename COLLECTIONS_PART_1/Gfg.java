import java.util.*;
public class Gfg{
    public static void main(String args[])throws Exception{
        try{
            List<String>list=new ArrayList<String>();
            list.add("a");
            list.add("b");
            list.add("c");
            System.out.println("List:"+list);
            List<String> synlist=Collections.synchronizedList(list);
            System.out.println(synlist);
        }
        catch(IllegalArgumentException e){
            System.out.println("Exeption thrown:"+e);
        }
    }
}