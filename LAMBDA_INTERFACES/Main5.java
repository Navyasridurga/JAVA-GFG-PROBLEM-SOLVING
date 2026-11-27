import java.util.function.Predicate;
public class Main5{
    public static void main(String args[]){
        Predicate<Integer>pre=n->n>0;
        System.out.println(pre.negate().test(-10));
    }
}