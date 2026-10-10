package Copy;

public class Mobile {
	String brand;
	int price;
	int ram;

}
class Main7{
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.brand="laptop";
		m1.price=9000;
		m1.ram=8;
		Mobile m2=new Mobile();
		m2.brand=m1.brand;
		m2.price=m1.price;
		m2.ram=m1.ram;
		m2.brand="bag";
		m2.price=9021;
		m2.ram=6;
		System.out.println(m1.brand);
		System.out.println(m1.price);
		System.out.println(m1.ram);
		System.out.println(m2.brand);
		System.out.println(m2.price);
		System.out.println(m2.ram);
		
	}
}
