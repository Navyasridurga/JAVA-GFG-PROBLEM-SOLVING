import java.util.*;
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Geeks{
    public static void main(String args[]){
        List<Student>students=new ArrayList<>();
        students.add(new Student("Ajay",27));
        students.add(new Student("Sneha",23));
        students.add(new Student("ajay",21));
        Collections.sort(students,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                int result=s1.name.compareTo(s2.name);
                return result==0? Integer.compare(s1.age,s2.age):result;

            }
        });
        for(Student s:students){
            System.out.println(s.name+":"+s.age);
        }

    }
}
