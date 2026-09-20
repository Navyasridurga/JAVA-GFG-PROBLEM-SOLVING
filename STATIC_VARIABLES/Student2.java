public class Student2 {
    String name;
    static String college="ISTS";
    public static void main(String arsg[]){
        Student2 s2=new Student2();
        Student2 s3=new Student2();
        s2.name="Navya";
        s3.name="Ravi";
        Student2.college="JNTUK";
        System.out.println(s2.name+"-"+Student2.college);
        System.out.println(s3.name+"-"+Student2.college);

    }
    
}
