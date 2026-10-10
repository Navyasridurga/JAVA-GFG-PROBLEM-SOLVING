package NestedInterface;

public interface Serializable {

}
class Person implements Serializable{
	public Person() {
		System.out.println("Person object created");
	}
}
class Animal {
	public Animal() {
		System.out.println("Animal object created");
	}
}

class Geeks{
	public static void main(String[] args) {
		Person p1=new Person();
		Animal a1=new Animal();
		if(p1 instanceof Serializable) {
			System.out.println("Person is serializable");
			
		}
		else {
			System.out.println("Person in not serializable");
		}
		if(a1 instanceof Serializable) {
			System.out.println("Animal is Serializable");
		}
		else {
			System.out.println("Animal is not serializable");
		}
		
	}
}