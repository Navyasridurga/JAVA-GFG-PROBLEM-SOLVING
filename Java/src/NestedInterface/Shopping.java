package NestedInterface;

public interface Shopping {

	void placeOrder();

	interface Payment {
		void pay();
	}

}
class OnlineStore implements Shopping{
	public void placeOrder() {
		System.out.println("Order placed successfully");
	}
}
	class UPIPayment implements Shopping.Payment{
		public void pay() {
			System.out.println("Payment completed using upi");
		}
	}
	class Main1{
		public static void main(String[] args) {
			OnlineStore o1=new OnlineStore();
			o1.placeOrder();
			UPIPayment u1=new UPIPayment();
			u1.pay();
			
		}
	}
	

