public class EmployeeSalary {
    
    public static void main(String[] args) {
       // System.out.print(args[0]);
        int a=Integer.parseInt(args[0]);
        System.out.println(" Salary:"+a);
        int bonus=5000;
        System.out.println("Bonus:"+bonus);
        int total=a+bonus;
        System.out.println("Total:"+total);
    }
}
