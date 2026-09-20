import java.util.Scanner;
public class Question_20 {
    void real(String num1,String num2,String num3){
        Integer n1=Integer.parseInt(num1);
        Integer n2=Integer.parseInt(num2);
        Integer n3=Integer.parseInt(num3);
        Integer result1= n1+25;
        Integer result2=n2*25;
        Integer result3=n3-25;
      System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1");
        
        String num1=sc.next();
        System.out.println("num2");
        String num2=sc.next();
        System.out.println("num3");
        String num3=sc.next();
      
        Question_20 q20=new Question_20();
        
        q20.real(num1,num2,num3);

    }

    
}
