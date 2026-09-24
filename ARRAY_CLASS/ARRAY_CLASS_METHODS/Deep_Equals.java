import java.util.Arrays;

public class Deep_Equals {
    public static void main(String args[]){
        int arr1[][]={ {12,3,45},{12,45,66}};
        int arr2[][]={{12,34,56},{23,4,65}};
        System.out.println(Arrays.deepEquals(arr1,arr2));
    }

}
