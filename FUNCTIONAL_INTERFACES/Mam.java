@FunctionalInterface
interface Number{
    boolean check(int n);
}
public class Mam{
    public static void main(String args[]){
        Number n1=(n)->(n%2==0);
      System.out.println(n1.check(71));
        
    }
}
