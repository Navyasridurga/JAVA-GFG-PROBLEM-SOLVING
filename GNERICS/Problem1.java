import java.util.*;
class Problem1{
    public static void  display(List<?>list){
        for(Object value:list){
            System.out.println(value);
        }
    }
    public static void main(String args[]){
List<Integer>nums=new ArrayList<>();
nums.add(10);
nums.add(90);
List<String> names=new ArrayList<>();
names.add("navya");
names.add("sri durga");
display(nums);
display(names);
    }
}