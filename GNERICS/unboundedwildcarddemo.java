import java.util.*;
import java.util.Arrays;

class Unboundedwilddemo{
    public static void main(String args[]){
        List<Integer>list1= Arrays.asList(1,2,4);
        List<Double>list2= Arrays.asList(1.2,3.4,5.6);
        System.out.println(list1);
        System.out.println(list2);
    }

    private static void printList(List<?>list){
        System.out.println(list);
    }

    }
