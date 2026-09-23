public class Employee_Payroll_System {
    public static void main(String[] args) {
        String name=args[0];
        int salary=Integer.parseInt(args[1]);
        int bonus=Integer.parseInt(args[2]);
        System.out.println("Employee name:"+name);
        System.out.println("Basic Salary:"+salary);
        System.out.println("Bonus:"+bonus);
        System.out.println("Gross Salary:"+(bonus+salary));
    }
}
