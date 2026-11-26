import java.util.*;

public class ContainsDuplicates {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean valid = false;
        int[] nums = { 1, 2, 3, 4 };

        for (int i = 0; i < nums.length; i++) {
            int arr = nums[i];
         
            if (hm.containsKey(arr)) {
                valid = true;

            } else {
                hm.put(arr,1);
            }
        }
        System.out.println(valid);
    }

}
