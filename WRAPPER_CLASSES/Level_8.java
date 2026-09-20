import java.util.Scanner;
public class Level_8 {
    String level8(int num1){
    if(num1%2==0){
        return "even";
        
    }
    return "odd"; 
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    Integer num1=sc.nextInt();
    Level_8 l8=new Level_8();
    String result=l8.level8(num1);
    System.out.println(result);


}
}
