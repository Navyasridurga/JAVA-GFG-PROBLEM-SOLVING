import java.io.FileNotFoundException;

class File{
    public static void main(String args[]){
        FileNotFoundException f1=new FileNotFoundException("File missing");
        RuntimeException e1=new RuntimeException("Download failed");
        e1.initCause(f1);
        try{
            throw e1;
        }
        catch(Exception e){
            System.out.println(f1.getMessage());
            System.out.println(e1.getMessage());
        }
       
    }
    
}