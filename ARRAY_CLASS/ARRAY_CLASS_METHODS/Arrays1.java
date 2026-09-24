import java.util.Arrays;
public class Arrays1 {
    public static void main(String args[]){
        int arr[][]={{19,9,34,67},{23,45,67,972,3}};
        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);
        System.out.println(Arrays.deepToString(arr));
    }
    
}
