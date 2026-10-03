package company;
import company.Employee;
public class Employee{
    public String name="Navya";
    protected int salary=50000;
    String department="IT";
    private int age=21;
    public static void main(String args[]){
        Employee e1=new Employee();
        System.out.println(e1.age);
        System.out.println(e1.department);
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}