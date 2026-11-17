import java.util.concurrent.locks.ReentrantLock;
public class ReentrantExample{
public  final ReentrantLock lock=new ReentrantLock();
    public void performTask(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName());

        }
        finally{
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        ReentrantExample r1=new ReentrantExample();
        Thread t1=new Thread(()->
    {
       r1.performTask();
    });
     t1.start();
    }
}