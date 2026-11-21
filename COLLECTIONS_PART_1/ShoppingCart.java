import java.util.*;
public class ShoppingCart{
    public static void main(String args[]){
        List<String> list=Collections.synchronizedList(new ArrayList<>());
        list.add("Mobile");
        list.add("Laptop");
        list.add("Keyboard");
        list.add("Mouse");
        System.out.println(list);
        boolean found=false;
        for(String s:list){
            if(s=="Laptop"){
                found=true;
                System.out.println("Laptop available:"+found);
                System.out.println("Total products:"+list.size());

            }
        
        }
    }
}