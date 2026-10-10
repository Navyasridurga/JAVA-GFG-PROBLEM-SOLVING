package NestedInterface;

public interface Bank {
	void openAccount() ;
	interface Transaction{
		void transferMoney();
	}

}
class MyBank implements Bank{
	public void openAccount() {
		System.out.println("Bank Account opened successfully");
	}
	
}
class MoneyTransfer implements Bank.Transaction{
	public void transferMoney() {
		System.out.println("Monet transferred successsfully");
	}
}
class Main3{
	public static void main(String[] args) {
		MyBank m1=new MyBank();
		m1.openAccount();
		MoneyTransfer m2=new MoneyTransfer();
		m2.transferMoney();
	}
}
