class Bank{
    int balance=500;
    public synchronized   void deposit(int amount){
        balance=balance+amount;
        
    }
    public synchronized int getBalance(){
       return balance;
    }
        public static void main(String args[])throws InterruptedException{
            Bank b1=new Bank();
            Thread t1=new Thread(()->{
                b1.deposit(1000);

            });
            
            Thread t2=new Thread(()->{
            b1.deposit(2000);
        });
       
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(b1.getBalance());
        

    }
        }
 

