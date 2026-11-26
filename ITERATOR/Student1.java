import java.util.*;
import java.util.Arrays;
class Student1{
    String name;
    int age;
    Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Geeks12{
    public static void main(String args[]){
        List<Student1>student=new ArrayList<>();
        student.add(new Student1("Ajay",27));
        student.add(new Student1("Sneha",23));
        student.add(new Student1("Rahul",21));
        student.sort((s1,s2)->Integer.compare(s2.age,s1.age));
        for(Student1 s:student){
            System.out.println(s.name+"->"+s.age);
        }
    }
}