import java.util.Arrays;
public class Copy_of2 {
    public static void main(String args[]){
        int arr[]={12,34,25,67};
        int copy[]=Arrays.copyOfRange(arr,1,4);
        System.out.println(arr);
        System.out.println(Arrays.toString(copy));

    }
    
}
