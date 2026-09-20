import java.util.Scanner;
public class Number_Guessing_Game_Project {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    int guessNumber=1+(int)(100*Math.random());
    int k=5;
    System.out.println("Number is chosen between 1 to 100");
    System.out.println("you have"+k+"limits to guess  the number");
    for(int i=0;i<=k;i++){
         System.out.println("Enter a Number");
        int user=sc.nextInt();
        if(guessNumber>user){
            System.out.println("Guess Lower");
        }
        else if(guessNumber<user){
            System.out.println("guess is Higher");
        }
        else if(guessNumber==user){
            System.out.println("guesses correctly, Win");
        }
    }
    System.out.println("limit is over try next Time");
    
}
}
