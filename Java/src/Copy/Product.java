package Copy;

class Product{
	String name;
	int price;
}
 class Main{
	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		p1.name="navya";
		
		p1.price=25;
		p2.name=p1.name;
		p2.price=p1.price;
		System.out.println(p1.name);
		System.out.println(p1.price);
		System.out.println(p2.name);
		System.out.println(p2.price);
	}
}
