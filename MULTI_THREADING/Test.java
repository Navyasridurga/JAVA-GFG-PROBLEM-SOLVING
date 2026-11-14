public class Test{
    public static void main(String args[]){
        Thread t1=Thread. currentThread();
        System.out.println("currentThread:"+t1.getName());
        t1.setName("Geeks");
        System.out.println("After name change:"+t1.getName());
        System.out.println("Main thread priority:"+t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main thread new priority:"+t1.getPriority());
        for(int i=0;i<5;i++){
            System.out.println("MAIN THREAD");
        }
Thread ct=new Thread(){
public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child thread");
                }
            }
        };
        

        // Child thread initially inherits the creator's priority
        System.out.println("Child thread priority: " + ct.getPriority());

        ct.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Child thread new priority: " + ct.getPriority());

        // Starting the child thread
        ct.start();
    

}
}