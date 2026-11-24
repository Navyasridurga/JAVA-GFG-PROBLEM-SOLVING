import java.util.*;
public class CreateStack{
    public static void main(String args[]){
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element:"+st.peek());
        System.out.println("Remove element:"+st.pop());
        System.out.println("Top element:"+st.peek());
        System.out.println("Stack:"+st);
    }
}