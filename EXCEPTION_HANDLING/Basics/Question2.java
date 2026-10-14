package Basics;

public class Question2 {
    public static void main(String[] args) {
        int [] numbers={10,20,30};
        try{
            System.out.println(numbers[9]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index ");
        }
        System.out.println("Finished ");
    }

}
