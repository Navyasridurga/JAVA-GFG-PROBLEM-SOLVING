package JAVA_VARIABLES_BASIC2;

public class BankAccount {
    String accountHolder="Navya";
    int balance=50000;
    void showDetails(){
        System.out.println("Account Holder:"+accountHolder);
        System.out.println("Balance:"+balance);

    }
    public static void main(String args[]){
        BankAccount b1=new BankAccount();
        b1.showDetails();
    }
    
}
