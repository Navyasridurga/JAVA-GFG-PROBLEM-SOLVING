import java.util.*;
import java.util.Arrays;
public class Problem6{
    public static  double display(List<? extends Number> list){
        double max=list.get(0).doubleValue();
        for(Number value:list){
            if(value.doubleValue()>max){
                max=value.doubleValue();
            }
        }
        return max;
    }
    public static void main(String args[]){
       List<Integer>nums=new ArrayList<>();
       nums.add(89);
       nums.add(87);
       nums.add(78);
       List<Double> values= new  ArrayList<>();
       values.add(10.8);
       values.add(12.3);
       values.add(78.3);
       List<Float> marks= new ArrayList<>();
       marks.add(90.2F);
       marks.add(89.7F);
       marks.add(92.1F);
       System.out.println(display(marks ));
       System.out.println(display(values));
       System.out.println(display(nums));

    }
}
