class Shopping{
    
    public static void main(String arsg[]){
        Exception e1=new Exception("Invalid card details");
        RuntimeException e2=new RuntimeException("pAYMENT FAILED");
        System.out.println(e2.initCause(e1));
        try{
            throw e2;
        }
        catch(RuntimeException e){
            System.out.println(e2.getMessage());
            System.out.println(e2.getCause().getMessage());
        }
    }
}