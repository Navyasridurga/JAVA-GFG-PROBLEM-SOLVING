public  class Website {
    private int visitors=0;

    public synchronized void visit(){
        visitors++;
    }
    public synchronized int  getvisit(){
        return visitors;
    }
}
class For{
    public static void main(String[] args) {
        Website w1=new Website();
       Thread t1=new Thread(()->{
        for(int i=0;i<500;i++){
            w1.visit();
        }
         });
        Thread t2=new Thread(()->{
            for(int i=0;i<500;i++){
                w1.visit();
            }
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
            System.out.println("Website visitors:"+w1.getvisit());
        }
      
    }
}

