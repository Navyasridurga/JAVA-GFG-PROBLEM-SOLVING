package ObjectMethods;

public class Employee {
    int employeeId;
    String employeeName;
    int salary;
    String department;
    Employee(int employeeId,String employeeName,int salary,String department){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
        this.department=department;

    }



public String toString(){
    return employeeId+" "+employeeName+" "+salary+" "+department;
}
    public static void main(String args[]){
        Employee e1=new Employee(12,"navya",23000,"it");
        System.out.println(e1.toString());
    }


}
