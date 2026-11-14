class BankAccount1{
    private int balance=1000;
    public synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("Deposit:"+amount+" balance:"+balance);
    }
    public synchronized void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("withdrawn:"+amount+"balance:"+balance);
        }
        else{
            System.out.println("Insufficient balance:"+amount);
        }
    }
    public int getBalance(){
        return balance;
    }
}
    class Geeks1{
        public static void main(String args[]){
            BankAccount1 b1=new BankAccount1();
            Thread t1=new Thread(()->
        {
            for(int i=0;i<3;i++){
                b1.deposit(200);
            
            try{
                Thread.sleep(50);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        });
        Thread t2=new Thread(()->
    {
        for(int i=0;i<3;i++){
            b1.withdraw(90);

        
        try{
            Thread.sleep(50);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    });
    t1.start();
    t2.start();
    try{
    t1.join();
    t2.join();
        }
    catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("Final Balance:"+b1.getBalance());
    }
}
