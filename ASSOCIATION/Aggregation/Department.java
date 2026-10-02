package Aggregation;

public class Department {

    String departName;
    Department(String departName){
        this.departName=departName;
    }
}
class Employee{
    String employeeName;
    Department department;
    Employee(String employeeName,Department department){
        this.employeeName=employeeName;
        this.department=department;
    }
    void display(){
        System.out.println("Employee:"+employeeName);
        System.out.println("department:"+department.departName);
    }
}
class Main{
    public static void main(String args[]){
        Department d1=new Department("CSE");
        Employee e1=new Employee("navya", d1);
        e1.display();
    }
}