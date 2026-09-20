class BankAccount{
    int balance=5000;
    void showBalance(){
        System.out.println(balance);
    }

    public static void main(String args[]){
        BankAccount b1=new BankAccount();
        b1.showBalance();
    }
}
