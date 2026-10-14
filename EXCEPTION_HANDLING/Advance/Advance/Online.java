public class Online {
    public static void main(String args[]){
        int availableBalance=1000;
        int paymentAmount=1500;
        try{
            
            try{
                if(availableBalance>paymentAmount){
                    throw  new Exception("dabbulu saripovatledu"); 
                }

            }
            catch(Exception e){
                System.out.println(e.getMessage());

            }
            finally{
                System.out.println("verification completed");
            }

        }
        finally{
            System.out.println("Shopping session closed");
        }
    }
    
}
