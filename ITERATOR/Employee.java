import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
class EmployeeComparator{
    public static void main(String args[]){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Ravi",25000));
        employees.add(new Employee("Anu",35000));
        employees.add(new Employee("Sneha",30000));
        Collections.sort(employees,new Comparator<Employee>() {
            public int compare(Employee e1,Employee e2){
                return Integer.compare(e1.salary,e2.salary);
            }
            
        });
        for( Employee e:employees){
            System.out.println(e.name+"->"+e.salary);
        }
        
    }
}