package practice.com;
import java.util.function.Consumer;

public class Square {
	public static void main(String[] args) {
		Consumer<Integer> cn= n->System.out.println(n*n);
		cn.accept(6);
	}

}
