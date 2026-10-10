package practice.com;
import java.util.function.Supplier;
public class DefaultAge {
	public static void main(String[] args) {
		Supplier<Integer>age=()->21;
		System.out.println(age.get());
		//Supplier<Double>price=()->899.0;
	///	Supplier<Integer> discount=()->15;
		
		//System.out.println(price.get());
	}

}
