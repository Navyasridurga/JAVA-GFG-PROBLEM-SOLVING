import java.util.*;
public class UniqueCharacter{
    public static void main(String args[]){
        HashMap<Character,Integer>hm=new HashMap<>();
        String s="loveleetcode";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(0);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
boolean found = false;
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(0);
            
            if(hm.get(ch)==1){
                System.out.println(i);
                found = true;
                break;
            }
            else{
                System.out.println("-1");
                break;
            }
        }
    }
}
