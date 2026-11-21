import java.util.*;
public  class Problem3{
    public  static void display(List<?> list){
        for(Object value: list){
            System.out.println(value);
        }
    }
    public static void main(String[] args) {

        List<Integer> ls=new ArrayList<>();
        ls.add(89);
        ls.add(90);
        ls.add(78);
        display(ls);
    }
}