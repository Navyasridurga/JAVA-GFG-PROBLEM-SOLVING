interface Fun1Interface{
    void display();
}
public class Main{
    public static void main(String args[]){
        Fun1Interface f1=()->
        System.out.println("This is a Zero parameter ");
        f1.display();
    }
}