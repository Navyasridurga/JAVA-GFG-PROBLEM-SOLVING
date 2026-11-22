import java.util.*;
public class Problem2{
    public static void main(String args[]){
        ArrayList <Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(12);
        ArrayList<Integer>l2=new ArrayList<>();
        l2.add(30);
        l1.addAll(l2);
        l2.addAll(l1);
        System.out.println(l1);
        System.out.println(l2);
        l1.addAll(1,l2);
        System.out.println(l1);
    }
}