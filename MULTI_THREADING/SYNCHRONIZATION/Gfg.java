public class Gfg{
    public static void main(String args[]){
        try{
            System.out.println("Entering into Deadlocks:");
            Thread.currentThread().join();
            System.out.println("This statements will necer excutes");
        }
        catch(InterruptedException e){
            e.printStackTrace();
            
        }
    }
}