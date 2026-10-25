import java.util.regex.*;
import java.util.Scanner;
public class Problem6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre you phone number");
       String phone=sc.next();
        Pattern p=Pattern.compile("[0-9]{10}");
        Matcher m=p.matcher(phone);
        System.out.println(m.matches());
if(m.matches()){
    System.out.println("succeffully ");
}
else if(phone.length()>10){
    System.out.println("number exceeds");
}
else if(phone.length()<10){
    System.out.println("phone number not correct");

}
else{
    System.out.println("enter phone number");
}

sc.close();
    }
}