class Student3{
    void display(int age){
        System.out.println("Age:"+age);
        int marks=80;
        System.out.println("marks:"+marks);
        if(marks>50){
            int bonus=10;
            System.out.println("Bonus:"+bonus);
        }
    }
    public static void main(String args[]){
        Student3 s1=new Student3();
      s1.display(10);

    }

}