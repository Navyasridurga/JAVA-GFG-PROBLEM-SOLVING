package practice.com;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Question1 {

	public static void main(String[] args) {
		Predicate<String> empty=em->em.isEmpty();
		Consumer<String> print =name ->System.out.println(name);
		System.out.println(empty.test("navya"));
		print.accept("java");

	}
}
