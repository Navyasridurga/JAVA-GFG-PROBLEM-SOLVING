import java.util.ArrayList;
public class Gfg1{
    public static void main(String args[]){
        ArrayList<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(9);
        System.out.println("All elements");
        al.forEach(n->System.out.println(n));
        System.out.println("Even elements");
        al.forEach(n->{
            if(n%2==0){
                System.out.println(n);
            }
        });
    }
}