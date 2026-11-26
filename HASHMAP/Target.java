 import java.util.*;
 public class Target{
    public static void main(String args[]){
        int arr[]={4,6,8};
        int target=10;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int needed=target-arr[i];
            if(hm.containsKey(needed)){
                System.out.println(hm.get(needed)+" "  +i);
                break;
            }
            hm.put(arr[i],i);
        }
    }
 }