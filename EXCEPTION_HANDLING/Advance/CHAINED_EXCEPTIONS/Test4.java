class Test4{
    public static void main(String args[]){
        Exception e1=new Exception("File not found");
        Exception e2=new Exception("Application failed");
        
        System.out.println(e2.initCause(e1));
        System.out.println(e2.getMessage());
        System.out.println(e2.getCause());
        System.out.println(e2.getCause().getMessage());

    }
}