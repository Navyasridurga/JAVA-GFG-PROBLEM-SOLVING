import java.util.Arrays;
public class ParalleLSetAll {
    public static void main(String args[]){
        int arr[]=new int[5];
        Arrays.parallelSetAll(arr,i->i*10);
        System.out.println(Arrays.toString(arr));


    }
    
}
