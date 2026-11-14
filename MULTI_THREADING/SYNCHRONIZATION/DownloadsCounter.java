public class DownloadsCounter {
    int download=0;
    public  void download(){
        download++;
    }
    public static void main(String args[]){
        DownloadsCounter d1=new DownloadsCounter();
        Thread t1=new Thread(()->{
              for(int i=0;i<=500;i++){
            d1.download();
            
        }
        });
       
        Thread t2=new Thread(()->{
             for(int i=0;i<=500;i++){
            d1.download();
            
        }
            
        });
        t1.start();
        t2.start();
       
       
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("downloads"+d1.download);
        }
    }
    
}
