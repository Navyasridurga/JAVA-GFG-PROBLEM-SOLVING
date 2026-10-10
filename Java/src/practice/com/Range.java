package practice.com;

import java.util.function.Predicate;
public class Range {
	public static void main(String[] args) {
		Predicate<Integer> range=rang-> rang>=10 && rang<=50;
		System.out.println(range.test(10));
		System.out.println(range.test(25));
		System.out.println(range.test(50));
		System.out.println(range.test(60));
		
	}

}
