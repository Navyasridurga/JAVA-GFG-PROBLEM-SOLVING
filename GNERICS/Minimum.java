import java.util.*;
import java.util.Arrays;
class Minimum{
    static double findMin(List<? extends Number> list){
        double min=list.get(0).doubleValue();
        for(Number  value:list){
        if(min<value.doubleValue()){
            min=value.doubleValue();

            
        }

    }
    return min;
    }
    public static void main(String args[]){
        List<Integer>nums=Arrays.asList(89,45,67,12,90);
        List<Double>doub=Arrays.asList(10.8,5.3,78.3,2.5);
        List<Float>flo=Arrays.asList(90.2f,89.7f,92.1f);
        System.out.println(findMin(flo));
        System.out.println(findMin(nums));
        System.out.println(findMin(doub));
    }
}