package practice.com;
import java.util.function.Predicate;
public class EmptyString {
	public static void main(String[] args) {
		Predicate<String> empty=em->em.isEmpty();
		System.out.println(empty.test("java"));
		System.out.println(empty.test(""));
	}

}
