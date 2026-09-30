abstract class Dataprocessor{
    abstract void process();
    abstract void validate();
    abstract void showStatus();

}
public class Dataprocessr extends Dataprocessor {
    void process(){
        System.out.println("Processing csv data");
    }
    void validate(){
        System.out.println("Validating csv data");

    }
    void showStatus(){
        System.out.println("Processing completed");
    }
    public static void main(String args[]){
        Dataprocessr d1=new Dataprocessr();
        d1.process();
        d1.validate();
        d1.showStatus();
    }

    
}
