class Employee1<T,U>{
   T employeeId ;
   U employeeName ;

   public Employee1(T employeeId ,U employeeName ){
    this.employeeId=employeeId;
    this.employeeName=employeeName;
   }
   public void setData(T employeeId ){
    this.employeeId=employeeId;
   }
   public T getemployeeId(){
    return employeeId;
   }
   public void getData(U employeeName ){
    this.employeeName=employeeName;
   }
   public U getData(){
    return employeeName;
   }
   public void  display(){
    System.out.println("EmployeeId:"+employeeId);
    System.out.println("EmployeeName:"+employeeName);
   }
   

    
}
class Emplou{
    public static void main(String args[]){
        Employee1<Integer,String> e1=new Employee1<>(101,"labanya");
        e1.display();
    
    }
}