class Employee{
    int salary;
    void showSalary(){
        System.out.println("salary is:"+salary);
    }
    public static void main(String args[]){
        Employee e1=new Employee();
        e1.salary=23000;
        e1.showSalary();
    }
}