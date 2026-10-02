package Patient.com;
public class Teacher {
    String name;
    Teacher(String name){
        this.name=name;
    }
    
}
class Student{
    String name;
    Teacher teacher;
    Student(String name,Teacher teacher){
        this.name=name;
        this.teacher=teacher;
    }
    void display(){
        System.out.println("Student:"+name);
        System.out.println("Teacher:"+teacher.name);
    }
}
class Main{
    public static void main(String args[]){
        Teacher t=new Teacher("chaitanya");
        Student s=new Student("Navya",t);
        s.display();

    }
}
