import java.util.function.Predicate;
public class Main2{
    public static void main(String args[]){
        Predicate<String>isEmpty=str->str.isEmpty();
        System.out.println(isEmpty.test(""));
    }
}