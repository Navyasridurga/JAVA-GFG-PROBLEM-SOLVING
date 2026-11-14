public class BankAccount{
    private int balance=1000;
    public synchronized void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawn :"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String args[]){
        BankAccount b1=new BankAccount();
        b1.withdraw(899);
        
    }
}