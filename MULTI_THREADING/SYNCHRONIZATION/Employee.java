public class Employee {
    int salary=2000;
    public synchronized void increaseSalary (int amount){
        salary=salary+amount;
    }
    public synchronized int getsalary(){
        return salary;
    }
}
 class Gfg{
    public static void main(String args[])throws InterruptedException{
        Employee e1=new Employee();
        Thread t1=new Thread(()->{
            e1.increaseSalary(5000);
        });
        Thread t2=new Thread(()->{
            e1.increaseSalary(3000);
        });
        t1.start();
        
        t2.start();
        t1.join();
        t2.join();
System.out.println("salary:"+e1.getsalary());
    }

}
