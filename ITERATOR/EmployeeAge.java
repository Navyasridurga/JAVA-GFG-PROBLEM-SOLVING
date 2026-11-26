import java.util.*;

public class EmployeeAge {
    String name;
    int age;

    EmployeeAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Main {
    public static void main(String args[]) {
        List<EmployeeAge> ls = new ArrayList<>();
        ls.add(new EmployeeAge("Ravi", 25));
        ls.add(new EmployeeAge("Anu", 30));
        ls.add(new EmployeeAge("Kiran", 22));
        Collections.sort(ls, new Comparator<EmployeeAge>() {

            public int compare(EmployeeAge e1, EmployeeAge e2) {
                int result = e1.name.compareTo(e2.name);
                return result == 0 ? Integer.compare(e1.age, e2.age) : result;
            }
        });

        for (EmployeeAge e1 : ls) {
            System.out.println(e1);
        }

    }
}
