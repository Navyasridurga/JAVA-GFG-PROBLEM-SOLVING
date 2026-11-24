import java.util.*;

public class ValidParanthesis {
    public static void main(String args[]) {
        Stack<Character> st = new Stack<>();
        String s = "([{}])";
        int n = s.length();
        boolean valid = true;
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);

            }
            else{
                if(st.isEmpty()){
                    valid=false;
                    break;
                }
                char top=st.pop();
                if(ch==')' && top!='('
                    || 
                    ch=='}' && top!='{'
                    || 
                    ch==']' && top!='['
            
                ){
                valid =false;
                break;
            }

        
        }
        }
    
    if(!st.isEmpty()){
        valid=false;
    }
    System.out.println(valid);
}
}