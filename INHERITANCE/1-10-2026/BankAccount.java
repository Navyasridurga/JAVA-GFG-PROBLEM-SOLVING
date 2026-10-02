public class BankAccount {
    int accountNumber;
    int balance;

    BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void showAccountDetails() {
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Balance:" + balance);

    }

}
class SavingAccount extends BankAccount {
    int intresetRate;

    SavingAccount(int accountNumber, int balance, int intresetRate) {
        super(accountNumber, balance);
        this.intresetRate = intresetRate;
    }
    

    @Override
    void showAccountDetails() {
        System.out.println("Intreset Rate:" + intresetRate);
        super.showAccountDetails();

    }


public static void main(String args[]) {
    SavingAccount s1 = new SavingAccount(121, 23000, 3);
    s1.showAccountDetails();
}

}