package practice.com;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Print_Name {
	public static void main(String[] args) {
		Consumer<String>n=name->System.out.println(name);
		n.accept("navya");
		
	}

}
