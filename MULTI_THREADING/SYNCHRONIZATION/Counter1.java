class Counter1{
    private int c=0;
    public void inc1(){
        synchronized(this){
            c++;
        }
    }
    public int getinc(){
        return c;
    }
}
class Geg{
    public static void main(String args[]) throws InterruptedException{
        Counter1 c1=new Counter1();
        Thread t1=new Thread(()->{
            for(int i=0;i<500;i++)
                c1.inc1();
        });
        Thread  t2=new Thread(()->{
            for(int i=0;i<500;i++)
                c1.inc1();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count:"+c1.getinc());


    }
}