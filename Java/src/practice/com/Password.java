package practice.com;
import java.util.function.Consumer;
public class Password {
	public static void main(String[] args) {
		Consumer<String>cn=s->{
		if(s.length()>8) {
			System.out.println("Strong password");
		}
		else {
			System.out.println("weak password");
		}
	};
	cn.accept("navyasridurga");
	cn.accept("navya");
	}
}
