class Test{
    public static void main(String args[]){
        Exception e1=new Exception("Original error");
        Exception e2=new Exception("Main error",e1);
        System.out.println(e2.getMessage());
        System.out.println(e2.getCause().getMessage());

    }
}