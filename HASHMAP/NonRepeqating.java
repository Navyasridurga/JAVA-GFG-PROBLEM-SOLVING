import java.util.*;

public class NonRepeqating {
    public static void main(String args[]) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String s = "aabbcde";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (hm.get(ch) == 1){
                System.out.println(ch);
            break;
        }
    }
}
}
