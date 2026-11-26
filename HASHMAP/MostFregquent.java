import java.util.Arrays;

public class MostFregquent {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 3, 4, 3, 2,2 };
        int max = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }

            }
            if (count > max) {
                max = count;
                result = arr[i];

            }
        }
        System.out.println(result);
    }
}
