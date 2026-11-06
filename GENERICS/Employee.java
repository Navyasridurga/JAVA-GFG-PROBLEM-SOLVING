public class Employee<T,U> {
    private U employeeId;
    private T employeeName;
    public Employee(T employeeName,U employeeId){
        this.employeeId=employeeId;
        this.employeeName=employeeName;

    }
    public Employee(){
        
    }
    public T getemployeeName(){
        return employeeName;
    }
    public U getemployeeId(){
        return employeeId;
    }
    public void setemployeeName(T employeeName){
        this.employeeName=employeeName;
    }
    public void setemployeeId(U employeeId){
        this.employeeId=employeeId;
    }

    public void displayDetails(){
        System.out.println("EmployeeName:"+employeeName);
        System.out.println("EmployeeID:"+employeeId);
    }

    
}
 class Main1{
    public static void main(String args[]){
        Employee<String,Integer> e1=new Employee<>("navya",101);
        Employee<String,Integer> e2=new Employee<>();
        e2.setemployeeName("durga");
        e2.setemployeeId(202);
        e1.displayDetails();
        e2.displayDetails();
       
    }
}
