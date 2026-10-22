import java.io.FileNotFoundException;

class Student{
    public static void main(String args[]){
        FileNotFoundException f1=new FileNotFoundException("Student file not found");
        RuntimeException r1=new RuntimeException("processsing failed",f1);
        try{
            throw r1;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            

        }

    }
}