import java.util.*;
public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer>ls=new ArrayList<>();
        ls.add(12);
        ls.add(1,78);
        System.out.println(ls);
        ArrayList<String>sl=new ArrayList<>();
        sl.add("geeks");
        sl.add("For");
        sl.add("geeks");
         System.out.println(sl);
        ArrayList<String>sl2=new ArrayList<>();
        sl2.add("navya");
        sl2.add("learning");
        sl2.add("java");
        sl.addAll(sl2);
        for(int i=0;i<sl.size();i++){
            System.out.println("index:"+i+":"+sl.get(i));
        }
        ArrayList<Integer>ls1=new ArrayList<>();
        ls1.add(10);
        ls1.add(20);
        ls1.add(30);
        ls1.set(1,100);
        System.out.println(ls1);
        ls1.remove(2);
        System.out.println(ls1);
        ls1.add(10);
        ls1.add(20);
        ls1.add(30);
        ls1.add(40);
        ls1.add(50);
        ls1.add(10);
        ls1.remove(Integer.valueOf(20));
        System.out.println(ls1);
        System.out.println(ls1.contains(90));
        System.out.println(ls1.contains(50));
        
       System.out.println(ls1.indexOf(30));
       System.out.println(ls.lastIndexOf(10));
       System.out.println(ls1.toString((toArray())));

        
    }
}