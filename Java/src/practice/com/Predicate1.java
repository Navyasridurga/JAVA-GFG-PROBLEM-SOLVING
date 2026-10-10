package practice.com;

import java.util.function.Predicate;

public class Predicate1 {
	public static void main (String args[]) {
	
		Predicate<Integer> checkAge = age-> age>=18;
		System.out.println(checkAge.test(90));
		
	}

}
