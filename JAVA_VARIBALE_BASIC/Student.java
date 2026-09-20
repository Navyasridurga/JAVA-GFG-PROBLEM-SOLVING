public class Student {
    
        int age;
        void display(){
            System.out.println("age is :"+age);
        }
        public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.age=21;
        s2.age=34;
        s1.display();
        s2.display();
        
        
    }
}
