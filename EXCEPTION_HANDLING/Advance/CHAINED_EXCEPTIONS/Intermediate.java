public class Intermediate {
    public static void main(String args[]){
        ArithmeticException e1=new ArithmeticException("Payment calculation failed");
        RuntimeException e2=new RuntimeException("Fee payment failed",e1);
        try{
          throw e2;

        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }
    
}
