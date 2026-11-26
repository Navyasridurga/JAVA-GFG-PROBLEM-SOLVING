import java.util.Arrays.*;
import java.util.*;
public class Travesr{
    public static void main(String args[]){
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<10;i++){
            al.add(i);
        }
        System.out.println(al);
        Iterator<Integer>il=al.iterator();
        while(il.hasNext()){
            int k=il.next();
            System.out.print(k+" ");
            if(k%2!=0){
                il.remove();
            }
        }
        System.out.println();
        System.out.println("Modified list:"+(il));
    }
}