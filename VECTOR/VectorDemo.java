import java.util.*;
public  class VectorDemo{
    public static void main(String args[]){
        Vector<Integer>v=new Vector<>();
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.add(90);
        v.add(67);
        v.add(61);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}