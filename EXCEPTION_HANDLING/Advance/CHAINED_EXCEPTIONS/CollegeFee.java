class CollegeFee{
    public static void main(String args[]){
        ArithmeticException a1=new ArithmeticException("Fee calculation failed");
        RuntimeException r1=new RuntimeException("Payment failed",a1);
        try{
            throw r1;
        }
        catch(Exception e){
           System.out.println(e.getMessage());
           System.out.println(e.getCause().getMessage());
        }
        finally{
            System.out.println("Payment process completed");
        
        
        }
    }
        void processPayment(RuntimeException e) throws RuntimeException{
            throw e;

        }
        }

    
            

    
