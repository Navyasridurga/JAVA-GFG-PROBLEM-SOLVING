
public class Main {
    public static void main(String args[]){
        try{
            try{
                System.out.println(10/8);
            }
            catch(ArithmeticException e){
                System.out.println("Inner exception handled");
            }
        
        System.out.println("Outer block completed");
    }
    catch(Exception e){
        System.out.println("Outer exception handled");
    }
}
    
}
