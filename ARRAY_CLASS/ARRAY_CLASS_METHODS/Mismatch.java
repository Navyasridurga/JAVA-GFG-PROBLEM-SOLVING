import java.util.Arrays;
public class Mismatch {
    public static void main(String args[]){
        int arr[][]={{12,34,56},{12,34,56}};
        int arr1[][]={{23,45,6},{34,56,78}};
        System.out.println(Arrays.mismatch(arr,arr1));

    }
    
}
