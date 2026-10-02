package ObjectMethods;

public class Student {
    String name="vishnu";
    int age=21;
public String toString(){
    return "Student{name=' "+name+" ',age="+age+"}";

}
public static void main(String args[]){
    Student s1=new Student();
    System.out.println(s1.toString());
}

}
