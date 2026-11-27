import java.util.function.Predicate;
public class Main4{
    public static void main(String args[]){
        Predicate<Integer>pre=n->n>10;
        Predicate<Integer>pre1=n->n<90;
        System.out.println(pre.or(pre1).test(90));
    }
}