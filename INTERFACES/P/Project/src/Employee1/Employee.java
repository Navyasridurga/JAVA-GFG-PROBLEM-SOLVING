package Employee1;

public abstract class Employee {
    abstract void work();
    public String name;
    protected int salary;
    String department;
    private int employeeId;
    Employee(String name,int salary,String department,int employeeId){
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.employeeId=employeeId;
    }
    void displayName(){
        System.out.println("Name:"+name);

    }
    void displaySalary(){
        System.out.println("salary:"+salary);
    }
    void displayDepartment(){
        System.out.println("Department:"+department);

    }
    void displayEmployeeId(){
        System.out.println("employeeId:"+employeeId);
    }

}
