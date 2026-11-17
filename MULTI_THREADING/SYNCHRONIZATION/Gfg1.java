class Table{
    public synchronized static  void printTable(int n){
        for(int i=1;i<8;i++){
            System.out.println(n*i);
            try{

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
    class Thread1 extends Thread{
        public void run(){
            Table.printTable(8);
        }
    }
    class Thread2 extends Thread{
        public void run(){
            Table.printTable(9);
        }
    }
public class Gfg1{
    public static void main(String args[]){
        Thread1 t1=new Thread1();
        Thread1 t2=new Thread1();
        t1.start();
        t2.start();
        
    }
}