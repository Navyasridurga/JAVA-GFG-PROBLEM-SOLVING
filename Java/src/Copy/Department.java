package Copy;

public class Department {
    String departmentName;
}

class Employee2 {
    String name;
    Department department;
}

class Main12 {
    public static void main(String[] args) {

        Employee2 e1 = new Employee2();
        e1.name = "navya";

        e1.department = new Department();
        e1.department.departmentName = "diploma";

        System.out.println(e1.name);
        System.out.println(e1.department.departmentName);

        Employee2 e2 = new Employee2();
        e2.name = e1.name;

        e2.department = new Department(); // Important line!
        e2.department.departmentName = e1.department.departmentName;

        e2.name = "sri durga";
        e2.department.departmentName = "Java";

        System.out.println(e2.department.departmentName);

        System.out.println(e1.name);
        System.out.println(e1.department.departmentName);
    }
}