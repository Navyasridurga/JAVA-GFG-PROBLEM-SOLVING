class CodeEditor{
    String language="General";
    CodeEditor(){
        System.out.println("Code edotor consrtucor");
    }
}
public class Child  extends CodeEditor{
    String language="Python";
    void display(){
        System.out.println(super.language);
        System.out.println(language);
    }
    Child(){
        System.out.println("python editor constructor");
    }
    public static void main(String args[]){
        Child c1=new Child();
        c1.display();
        
    }

    
}
