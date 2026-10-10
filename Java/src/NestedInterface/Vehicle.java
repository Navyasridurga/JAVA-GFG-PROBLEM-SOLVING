package NestedInterface;

public interface Vehicle {
	void start();
	interface Engine{
	void run();
	}
}
class Car implements Vehicle{
	public void start() {
		System.out.println("Vehicle start");
	}
}
	class PetrolEnginee  implements Vehicle.Engine{
		public void run() {
			System.out.println("Engine running");
		}
	}
		class Main{
			public static void main(String[] args) {
				Car c1=new Car();
				c1.start();
				PetrolEnginee p1=new PetrolEnginee();
				p1.run();
				
			}
		
	}

