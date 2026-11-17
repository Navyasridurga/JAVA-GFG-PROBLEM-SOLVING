class SharedData{
    volatile boolean running=true;
}
 class Main{
    public static void main(String[] args)throws InterruptedException {
        SharedData s1=new SharedData();
        Thread t1=new Thread(()->
    {
        System.out.println("Thread started");
        while(s1.running){

        }
    });
    t1.start();
    Thread.sleep(1000);
    s1.running=false;
    System.out.println("Main thread changed running to false");
    }
}