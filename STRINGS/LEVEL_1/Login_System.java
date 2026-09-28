import java.util.Scanner;

public class Login_System {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user name");
        String register_Name = sc.next();

        String user_Name = "navya";
        if (user_Name == register_Name) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username");
        }
        if(user_Name.equals(register_Name)){
            System.out.println("vacha talli");
        }

        else{
            System.out.println("ralede");
        }
    }
}