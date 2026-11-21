import java.util.*;
class Main{
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<Integer>();
        numbers.add(90);
       numbers.add(90);
        List<?>list1=numbers;
        for(Object value:list1){
        System.out.println(value);
        }
    }
}