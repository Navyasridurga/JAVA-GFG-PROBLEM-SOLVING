class Student{
    String name="Navya";
    static String college="ISTS";
void display(){
    System.out.println(name);
    System.out.println(Student.college);

}
public static void main(String args[]){
    Student s1=new Student();
    s1.display();

}
}