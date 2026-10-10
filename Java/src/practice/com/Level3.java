package practice.com;
import java.util.function.Predicate;

public class Level3 {
	public static void main(String[] args) {
		Predicate<Integer> even=pos->pos%2==0 && pos>0;
		System.out.println(even.test(10));
		System.out.println(even.test(-10));
		System.out.println(even.test(9));
	}

}
