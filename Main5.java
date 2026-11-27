import java.util.functionla.Predicate;
public class Main5{
    public static void main(String args[]){
        Predicate<String>check=Predicate.isEqual("java");
        System.out.println(check.test("java"));
    }
}