class Bank1{
    String accountHolderName;
    int accountNumber;
    int balance;
    Bank1(String accountHolderName,int accountNumber,int balance){
            this.accountHolderName=accountHolderName;
            this.accountNumber=accountNumber;
            this.balance=balance;
         }
        public static void main(String args[]){
            Bank1 b=new Bank1("navya",23000,3400);
            System.out.println(b.accountHolderName);
            System.out.println(b.accountNumber);
            System.out.println(b.balance);

        }
    

}