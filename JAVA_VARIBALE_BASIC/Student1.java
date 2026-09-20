class Student1{
    int age=20;
   void display(){
        int marks=90;
        System.out.println(marks);
    }
    public static void main(String args[]){
            Student1 s1=new Student1();
        System.out.println(s1.age);
       s1.display();
    }
}