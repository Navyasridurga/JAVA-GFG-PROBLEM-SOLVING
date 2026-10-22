public class Message{
    public static void main(String arsg[]){
        Exception e1=new Exception("Database Failed");
        Exception e2=new Exception("Login failes");

        System.out.println(e2.initCause(e1));
    }
}