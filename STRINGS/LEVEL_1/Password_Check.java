import java.util.Scanner;

public class Password_Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("user enter password");
        String user_pass = sc.next();
        String register_pass = "Java@123";
        if (register_pass.equals(user_pass)) {
            System.out.println("Password correct");

        } else {
            System.out.println("wrong password");
        }
    }

}
