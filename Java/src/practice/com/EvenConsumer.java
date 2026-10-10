package practice.com;
import java.util.function.Consumer;

public class EvenConsumer {
	public static void main(String[] args) {
		Consumer<Integer> cn=n->{
			if(n%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		};
		cn.accept(90);
		
	}
}
