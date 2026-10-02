package ObjectMethods;

public class BankAccount {
    int accountNumber;
    String holderName;
    int balance;
    BankAccount(int accountNumber,String holderName,int balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }


@Override 
public String  toString(){
    return accountNumber+" "+holderName+" "+balance;
}

public static void main(String args[]){
    BankAccount b1=new BankAccount(123,"navya",23000);
    System.out.println(b1);
}
}
