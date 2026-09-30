class Student{
    String name;
    int age;
    private Student(String name,int age){
        this.name=name;
        this.age=age;

    }
    void displayDetails(){
        System.out.println(name);
        System.out.println(age);

    }
    public static void main(String args[]){
        Student s1=new Student("navya",90);
        s1.displayDetails();
    }
}