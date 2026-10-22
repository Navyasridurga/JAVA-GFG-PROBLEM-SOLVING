class Test3{
    public static void main(String args[]){
        Exception e1=new Exception("File not found");
        System.out.println(e1.getMessage());
        System.out.println(e1.getCause());
    }
}
