package cloninng;

public class Product implements Cloneable {
	String name;
	int price;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

	class Main13 {
		public static void main(String[] args) throws CloneNotSupportedException {
			Product p1 = new Product();
			p1.name = "laptop";
			p1.price = 34000;
			Product p2 = (Product) p1.clone();
			System.out.println(p1.name);
			System.out.println(p1.price);
			System.out.println(p2.name);
			System.out.println(p2.price);

		}
	}

