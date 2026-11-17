class Shared{
    volatile boolean flag=false;
}
public class Main{
    public static void main(String args[]){
        Shared s1=new Shared();
        Thread t1=new Thread(()->
    {
        while(s1.flag){

        }
        System.out.println("completed");
    });
    t1.start();
    s1.flag=true;
    }
}