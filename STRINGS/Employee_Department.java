import java.util.Scanner;

public class Employee_Department {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter department");
        String user = sc.next();
        System.out.println("Employee Name:Navya");
        if (user.equals("IT")) {
            System.out.println("Welcome to IT Department");

        } else {
            System.out.println("Department not found");
        }

    }

}
