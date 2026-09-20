class Student1{
    String name;
    static String  college="ISTS";


public static void main(String args[]){
    Student1 s1=new Student1();
    Student1 s2=new Student1();
    s1.name="Navya";
    s2.name="Ravi";
    System.out.println(s1.name+"-"+Student1.college);
    System.out.println(s2.name+"-"+Student1.college);
}

}