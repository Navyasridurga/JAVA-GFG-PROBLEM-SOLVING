package JAVA_VARIABLES_BASIC2;
class Employee{
    String name="Ravi";
    int salary=30000;
    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Salary:"+salary);

    }
    public static void main(String args[]){
        Employee e1=new Employee();
        e1.display();
    }
}
