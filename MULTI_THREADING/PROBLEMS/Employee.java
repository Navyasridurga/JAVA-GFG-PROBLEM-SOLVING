import java.util.concurrent.locks.ReentrantLock;
class Employee{
    ReentrantLock lock=new ReentrantLock();
    int salary=20000;
    public void increaseSalary(){
        lock.lock();
    
    try{
        salary=salary+5000;
    }
    finally{
        lock.unlock();
    }
}
}


class Emp{
    public static void main(String[] args) throws InterruptedException {
        Employee e1=new Employee();
        Thread t1 =new Thread(()->
    {
        e1.increaseSalary();
    });
    t1.start();
    t1.join();
    
    
    System.out.println("salary:"+e1.salary);
    }

}


