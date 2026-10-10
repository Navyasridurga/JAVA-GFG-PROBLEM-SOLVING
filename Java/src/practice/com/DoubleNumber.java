package practice.com;
import java.util.function.Consumer;

import java.util.function.Predicate;
public class DoubleNumber {
	public static void main(String[] args) {
		
		
		Consumer<Integer> cn= n-> System.out.println(n*2);
		cn.accept(67);
		
	}

	

}
