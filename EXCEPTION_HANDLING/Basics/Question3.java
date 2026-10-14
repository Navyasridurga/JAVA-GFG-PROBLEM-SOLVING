package Basics;



public class Question3 {

    public static void main(String[] args) {
        String value = "hello";

        try {
            int n = Integer.parseInt(value);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
        System.out.println("Completed");
    }
}
