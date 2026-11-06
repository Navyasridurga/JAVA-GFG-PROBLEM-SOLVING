class Student<T>{
private  T studentName ;
public Student( T studentName){
    this.studentName=studentName;
}

public  T getStudentName(){
    return studentName;
}
public void setStudentName(T studentName){
    this.studentName=studentName;
}
public void displayDetails(){
    System.out.println("StudentName:"+studentName);
}
}
public class Main{
    public static void main(String[] args) {
        Student<String> s1=new Student<>("navya");
        Student<Integer>s2=new Student<>(100);
        s1.displayDetails();
        s2.displayDetails();
    }

}
