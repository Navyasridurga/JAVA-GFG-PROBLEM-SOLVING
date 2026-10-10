package practice.com;
import java.util.function.Consumer;

public class Length1 {
	public static void main(String[] args) {
		Consumer<String> cn=s->System.out.println(s.length());
		cn.accept("programming");
	}

}
