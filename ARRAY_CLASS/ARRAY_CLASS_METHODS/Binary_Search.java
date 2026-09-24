import java.util.Arrays;
public class Binary_Search {

    public static void main(String[] args) {
        int arr[]={10,20,30,45};
        Arrays.sort(arr);
        int key=30;
        System.out.println(Arrays.binarySearch(arr,key));

    }
    
}
