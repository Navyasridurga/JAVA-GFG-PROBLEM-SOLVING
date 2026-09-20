import java.util.Scanner;
public class Quetion_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int  num1=sc.nextInt();
        System.out.println("enter b value");
        int num2=sc.nextInt();
        Integer num3=num1*num2;
        Integer num4=num1-num2;
        Integer num5=num1+num2;
        System.out.println("Addition:"+num5);
        System.out.println("Substraction:"+num4);
        System.out.println("Muiltplication:"+num3);

    }
    
}
