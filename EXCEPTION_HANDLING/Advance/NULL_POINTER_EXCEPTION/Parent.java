import java.io.*;

class Parent{
    void method() throws IOException
    {
        System.out.println("Super class");
    }
}
class Subclass extends Parent{
    void method(){
        System.out.println("Sub class");
    }

public static void main(String args[]){
    SubClass s1=new SubClass();
    try{
    s1.method();
    }
    catch(IOException e)
    {
e.printStackTrace();
    }
}

}
