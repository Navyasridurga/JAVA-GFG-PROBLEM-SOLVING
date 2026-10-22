class StudnetExam{
   public static void main(String args[]){
        ArithmeticException a1=new ArithmeticException("Marks calculation failed");
        RuntimeException r1=new RuntimeException("Result generation failed ",a1);
        try{
            throw r1;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        finally{
            System.out.println("Result process completed");
        }
   }
        void processResult (RuntimeException e) throws RuntimeException{
            throw e;
        }
}


         
          

    


