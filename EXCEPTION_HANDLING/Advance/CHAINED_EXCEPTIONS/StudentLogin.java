class StudentLogin{
    public static void main(String args[]){
        Exception e1=new Exception("Invalid Password");
        Exception e2=new Exception("Student login failed",e1);
        System.out.println(e1.getMessage());
        System.out.println(e2.getMessage());
        System.out.println(e2.getCause());
    }
}