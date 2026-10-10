package NestedInterface;

public class Outer {
	interface Inner{
		void display();
	}

}
class Ghg implements Outer.Inner{
	public void display() {
		System.out.println("Hello from ested inside a class");
	}
	public static void main(String[] args) {
		Outer.Inner obj=new Ghg();
		obj.display();
	}
}
