import java.util.*;
public class DuplicatesElements{
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int arr[]={1,2,3,2,4,1,5};
      for(int i=0;i<arr.length;i++){
        int num=arr[i];
        if(hm.containsKey(num)){
            hm.put(num,hm.get(num)+1);
        }
        else{
            hm.put(num,1);
        }
      }
      for(int num:hm.keySet()){
        if(hm.get(num)>1){
            System.out.print(num+" ");
        }
    }


        }
      }