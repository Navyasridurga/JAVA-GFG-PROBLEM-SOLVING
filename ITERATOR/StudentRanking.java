import java.util.Comparator;
import java.util.*;

public class StudentRanking {
    String name;
    int marks;

    StudentRanking(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}

class Main {
    public static void main(String args[]) {
        List<StudentRanking> st = new ArrayList<>();
        st.add(new StudentRanking("Ravi", 85));
        st.add(new StudentRanking("Anu", 95));
        st.add(new StudentRanking("Kiran", 85));
        st.add(new StudentRanking("Sneha", 70));
        st.add(new StudentRanking("Priya", 85));
        Collections.sort(st, new Comparator<StudentRanking>() {
            public int compare(StudentRanking s1, StudentRanking s2) {
                int result = Integer.compare(s1.marks, s2.marks);
           
        if (result == 0) {
            return s1.name.compareTo(s2.name);

        }
        return result;
        }
    });
    

        for (StudentRanking s : st) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}



