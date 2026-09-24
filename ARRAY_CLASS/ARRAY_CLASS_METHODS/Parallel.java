import java.util.Arrays;
public class Parallel {
    public static void main(String args[]){
        int arr[]={12,34,56,78,99};
        Arrays.parallelPrefix(arr,1,5,(a,b)->a+b);
        System.out.println(Arrays.toString(arr));

    }
    
}
