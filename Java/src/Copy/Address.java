package Copy;

public class Address {
	String city;
	

}
class Student{
	String name;
	Address address;
	
}
class Main8{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Navya";
		s1.address =new Address();
		s1.address.city="Hyderabad";
		Student s2=new Student();
		
		s2.name=s1.name;
		s2.address=new Address();
		s2.address.city=s1.address.city;
		s2.address.city="chennai";
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		
		
	}
}
