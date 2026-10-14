package Basics;

public class Question1 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Error occured ");

        }
        System.out.println("Program ended");
        
    }

}
