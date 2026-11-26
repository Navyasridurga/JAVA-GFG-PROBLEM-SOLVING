import java.util.*;
class Student1 implements Comparable<Student1>{
    int id;
    String name;
    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(Student1 other){
        if(other==null){
            throw new NullPointerException("Cannot compare with null");
        }
        return Integer.compare(this.id,other .id);
    }
    @Override 
    public String toString(){
        return id+"-"+name;
    }
}
 class ComparableExample{
    public static void main(String[] args) {
        List<Student1> students=new ArrayList<>();
        students.add(new Student1(3,"Alice"));
        students.add(new Student1(1,"Bob"));
        students.add(new Student1(2,"Charlie"));
        Collections.sort(students);
        System.out.println(students);

    }

}