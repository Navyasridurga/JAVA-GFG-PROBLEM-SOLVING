class BankAccount{
    public void display(){
        String accountType="Savings";
        int balance=1000;
        System.out.println(accountType);
        System.out.println(balance);
    }
    public static void main(String args[]){
        BankAccount ba=new BankAccount();
        
        ba.display();
    }
}