import java.util.*;
public class Digits{
    public static void main(String args[]){
        ArrayList<Integer>al=new ArrayList<>();
        int digits[]={4,3,2,1};
        for(int i=0;i<digits.length;i++){
            al.add(digits[i]);
             
        }
       
            int index=al.size()-1;
        int n=al.get(index);
        n=n+1;
        al.set(index,n);
            
        System.out.println(al);
        } 
       
        }
    


