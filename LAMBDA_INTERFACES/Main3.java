import java.util.function.Predicate;
public class Main3{
    public static void main(String args[]){
        Predicate<Integer>gretheThan10=n->n>10;
        Predicate<Integer>lessThan50=n->n<50;
        System.out.println(gretheThan10.and (lessThan50).test(89));
        System.out.println(gretheThan10.and(lessThan50).test(25));
    }
}