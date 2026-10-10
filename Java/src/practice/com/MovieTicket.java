package practice.com;

import java.util.function.Consumer;

public class MovieTicket {
	public static void main(String[] args) {
		Consumer<Integer> cn = n -> System.out.println(n * 3);
		cn.accept(250);
	}

}
