class Student4{
    String name="Navya";
   static String college="ISTS";
    
    void display(int marks){
        
        int bonus=5;
        System.out.println("Bonus:"+bonus);
        int total=marks+bonus;
        System.out.println("Total:"+total);
        if(total>50){
            int grade=1;
            System.out.println("Grade:"+grade);
        }
        }
        public static void main(String args[]){
            Student4 s4=new Student4();
            System.out.println(s4.name);


System.out.println(Student4.college);
            s4.display(60);
        }
}