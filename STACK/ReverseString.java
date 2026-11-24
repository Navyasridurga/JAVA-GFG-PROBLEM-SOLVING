import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));

        }
        String reverse="";
        while(!st.isEmpty()){
            char ch=st.pop();
            reverse=reverse+ch;
        }
        System.out.println(reverse);

    }
}
