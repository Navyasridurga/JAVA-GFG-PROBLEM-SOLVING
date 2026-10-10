package practice.com;
import java.util.function.Predicate;

public class Age {
	public static void main(String[] args) {
		Predicate<Integer> check=age->age>=18;
		System.out.println(check.test(21));
		System.out.println(check.test(16));
	}

}
