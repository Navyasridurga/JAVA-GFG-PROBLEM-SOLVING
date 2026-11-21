import java.util.*;
public class Problem4{
    static void display(List<?>list){
        for(Object value:list){
            System.out.println(value);
        }
    }
    public static void main(String args[]){
        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        List<String> names=new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("SQL");
        List<Double>ls=new ArrayList<>();
        ls.add(10.5);
        ls.add(20.5);
        ls.add(20.5);
        // display(nums);
        // display(names);
        // display(ls);
            System.out.println(nums);
            System.out.println(names);
            System.out.println(ls);
    }

}