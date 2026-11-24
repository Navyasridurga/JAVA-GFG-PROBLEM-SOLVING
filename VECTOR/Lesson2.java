import java.util.*;
public class Lesson2{
    public static void main(String[] args) {
        Vector <Integer>v1=new Vector<>();
        System.out.println("v1:size"+v1.size());
        System.out.println("v1: capacity"+v1.capacity());
        Vector<Integer>v2=new Vector<>(5);
        System.out.println("v2: size"+v2.size());
        System.out.println("v2: capacity"+v2.capacity());
        Vector<Integer> v3=new Vector<>(3,2);
        System.out.println("v3: size"+v3.size());
        System.out.println("v3: capacity"+v3.capacity());

    }
}