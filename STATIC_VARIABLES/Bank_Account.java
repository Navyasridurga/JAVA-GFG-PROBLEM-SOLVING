public class Bank_Account {
    void display(int balance){

        System.out.println("Balance:"+balance);
        int deposit=5000;
        System.out.println("Deposit:"+deposit);
        int total=balance+deposit;
        System.out.println("Total:"+total);
        if(total>20000){
            int bonus=10000;
            System.out.println("Bonus: "+bonus);
        }
    }
    public static void main(String args[]){
        Bank_Account b1=new Bank_Account();
        b1.display(10000);
    }
    
}
