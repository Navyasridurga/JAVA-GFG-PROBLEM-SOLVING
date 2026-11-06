class Student {
    int marks = 90;
}

public class MemoryDemo {

    public static void main(String[] args) throws InterruptedException {

        int age = 21;

        Student s1 = new Student();
        Student s2 = s1;

        System.out.println("Program Running...");
        System.out.println(s1.marks);

        // Keep program alive for 2 minutes
        Thread.sleep(120000);
    }
}