import java.util.*;
public class Frequncey{
    public static void main(String args[]){
        HashMap<Character,Integer>hm=new HashMap<>();
        String s="Programming";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(s.charAt(i),hm.getOrDefault(ch,0)+1);
        }
        System.out.println(hm);
    }
}