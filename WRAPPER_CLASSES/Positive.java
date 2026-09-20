import java.util.Scanner;
public class Positive {
    String postive(int num1){
        if(num1<0){
            return "negative";
        }
        else if(num1>0){
            return "positive";
        }
        else{
            return "zero";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        Integer num1=sc.nextInt();
        Positive p1=new Positive();
        String result=p1.postive(num1);
        System.out.println(result);

        
    }
}
