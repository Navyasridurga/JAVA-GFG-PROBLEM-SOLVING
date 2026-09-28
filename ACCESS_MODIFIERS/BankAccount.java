public class BankAccount {
    
        private String accountHolderName;
        private int accountNumber;
        private int balance;
    
     BankAccount(String accountHolderName,int accountNumber,int balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
     }
    

    
    void displayAccount(){
        System.out.println("account Holder:"+accountHolderName);
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance: "+ balance);
    }
    public static void main(String args[]){
        BankAccount b1=new BankAccount("navya",776754565,21000);
        BankAccount b2=new BankAccount("sri",643547564,123000);
        b1.displayAccount();
        b2.displayAccount();
    }

}
    
