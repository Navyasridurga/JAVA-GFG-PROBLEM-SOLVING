public class Employee_Task extends Thread {
    String employeeName;
    String taskName;
    public Employee_Task(String employeeName,String taskName){
        this.employeeName=employeeName;
        this.taskName=taskName;
    }

public void run(){
    System.out.println("employeeName:"+employeeName);
    System.out.println("TaskName:"+taskName);
}
public static void main(String args[]){
    Employee_Task e1=new Employee_Task("Navya","BackEnd developement");
    Employee_Task e2 =
    new Employee_Task("Durga", "Database Testing");

Employee_Task e3 =
    new Employee_Task("Priya", "Frontend Development");

    e1.start();
    e2.start();
    e3.start();
    


}
}
