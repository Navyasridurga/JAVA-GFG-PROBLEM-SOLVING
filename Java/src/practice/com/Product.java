package practice.com;

import java.util.function.Consumer;
public class Product {
	public static void main(String[] args) {
		Consumer<Integer> cn=price->{
			if(price>1000) {
				System.out.println("Expensive Product");
			}
			else {
				System.out.println("Affordable product");
			}
		};
		
		cn.accept(1500);
		cn.accept(500);
	}

}
