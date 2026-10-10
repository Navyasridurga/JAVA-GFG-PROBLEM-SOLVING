package practice.com;
import java.util.function.Consumer;

public class UpperCase {

	public static void main(String[] args) {
		Consumer<String> cn=s->System.out.println(s.toUpperCase());
		
		cn.accept("java");
	}
}
