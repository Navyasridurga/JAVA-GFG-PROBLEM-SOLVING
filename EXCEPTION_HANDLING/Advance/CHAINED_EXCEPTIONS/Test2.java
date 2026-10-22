class Test2{
    public static void main(String args[]){
        ArithmeticException e1=new ArithmeticException("DIVSION FAILED");
        Exception e2=new Exception("Calculation error",e1);
        System.out.println(e1.getCause());
        System.out.println(e2.getCause());


    }
}