public class Student3 {
    String name="Navya";
    int age=21;
    void display(){
        int marks=85;
        System.out.println(marks);

    }
    public static void main(String args[]){
        Student3 s3=new  Student3();
        System.out.println(s3.name);
        System.out.println(s3.age);
        s3.display();
    }
    
}
