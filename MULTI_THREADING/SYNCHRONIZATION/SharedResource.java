import java.util.concurrent.locks.ReentrantLock;
public class SharedResource{
    private final ReentrantLock lock=new ReentrantLock();
    public void performaceTask(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" is performaing task");
        }
        finally{
            lock.unlock();
        }
    }
public void methodB(){
    lock.lock();
    try{
        System.out.println("Inside method b");
    }
    finally{
        lock.unlock();
    }
}
public static void main(String args[]){
    SharedResource s1=new SharedResource();
    s1.performaceTask();
}

}