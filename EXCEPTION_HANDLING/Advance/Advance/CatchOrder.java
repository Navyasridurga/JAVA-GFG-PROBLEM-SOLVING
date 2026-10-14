

public class CatchOrder {
public static void main(String[] args) {
    try{
        System.out.println(90/0);
    }
    catch(ArithmeticException e){
        System.out.println();
    }
    catch(Exception e){
        System.out.println();
    }
}
}
