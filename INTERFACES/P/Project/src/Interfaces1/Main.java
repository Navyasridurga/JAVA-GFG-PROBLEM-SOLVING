package Interfaces1;
import company.Employee;

public class Main {
    public static void main(String args[]){
        Developer1 d1=new Developer1();
        d1.login();
        d1.work();
        System.out.println(Employee.company_Name);
    }


}
