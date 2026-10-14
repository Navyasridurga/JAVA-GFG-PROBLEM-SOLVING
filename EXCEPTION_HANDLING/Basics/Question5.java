package Basics;

public class Question5 {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array is out of box");
        }
        catch(ArithmeticException e){
            System.out.println("Arithemtic exception");
        }
        System.out.println("Program Completed");
    }

}
