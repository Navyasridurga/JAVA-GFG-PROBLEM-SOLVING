class PaymentApp{
    public static void main(String args[]){
        Exception e1=new Exception("Insufficient balance");
        Throwable t1=new Throwable("PAYMENT TRANSACTION FAILES",e1);
        System.out.println(t1.getMessage());
        System.out.println(t1.getCause().getMessage());

    }
}