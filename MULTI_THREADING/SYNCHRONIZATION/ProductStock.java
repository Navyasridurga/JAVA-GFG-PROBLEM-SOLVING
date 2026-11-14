public class ProductStock extends Thread {
    int stock =100;
    public synchronized void purchase(int quantity){
        if(stock>=quantity){
            stock-=quantity;
            System.out.println("stock:"+stock);
        }
        else{
            System.out.println("Insufficient stock");
        }
    }
    public static void main(String args[]){
        ProductStock p1=new  ProductStock();
        Thread t1=new Thread(()->
        {
           p1.purchase(56); 
        });
        Thread t2=new Thread(()->
        {
        p1.purchase(89);
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            System.out.println(p1.stock);
        }
    }}