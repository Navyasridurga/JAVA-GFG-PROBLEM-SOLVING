import java.util.*;
public class CountElemts {
    public static void main(String args[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
    int arr[]={10,20,30,10,20,10};
    for(int num:arr ){
        hm.put(num,hm.getOrDefault(num,0)+1);
           
        }
         System.out.println(hm);
    }
     
}
