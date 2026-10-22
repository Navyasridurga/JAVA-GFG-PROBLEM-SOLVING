public class College {
    public static void main(String args[]){
        try{        Exception e1=new Exception("Invalied password");
        e1.initCause(new Exception("Student login failed"));
       // throw e1;


    }
    catch(NumberFormatException e1){
        System.out.println("Caught Exception:"+e1);
        System.out.println(e1.getCause());
    }
    
}
}
