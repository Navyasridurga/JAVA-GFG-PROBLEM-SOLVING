public class Counter {
    private int count=0;
    public synchronized  void inc(){
        count++;
    }
    public synchronized int get(){
        return count;
    }

    
}
 class Geeks{
    public static void main(String args[]){
        Counter c2=new Counter();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                c2.inc();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++)
                c2.inc();
            
        });
        t1.start();
        t2.start();
    
    try{
        t1.join();
        t2.join();
    }
    catch(InterruptedException e ){
        e.printStackTrace();
    }
        System.out.println("Counter:"+c2.get());

    }
}
