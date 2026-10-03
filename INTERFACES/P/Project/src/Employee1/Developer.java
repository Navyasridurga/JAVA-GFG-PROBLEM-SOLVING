package Employee1;


public class Developer extends Employee {
    public Developer(String name,int salary,String department,int employeeId){

    super(name,salary,department,employeeId);

    }
    @Override
     void work(){
        System.out.println("Developer write code");

     }

    

public class Main{
    public static void main(String args[]){
    Developer d1=new Developer("Navya",23000,"It",123);
    d1.displayDepartment();
    d1.displayEmployeeId();
    d1.displayName();
    d1.displaySalary();
    }
}
}
