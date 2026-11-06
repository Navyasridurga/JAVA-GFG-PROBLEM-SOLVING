class Student {
    String studentName;
    int studentMarks;

    public Student(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Marks: " + studentMarks);
    }
}

class Storage<T> {
    T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class Main {
    public static void main(String args[]) {

        Student student1 = new Student("Navya", 90);

        Storage<Student> storage = new Storage<>();

        storage.setData(student1);

        Student result = storage.getData();

        result.display();
    }
}