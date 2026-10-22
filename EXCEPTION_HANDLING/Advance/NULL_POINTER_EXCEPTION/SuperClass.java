import java.io.*;

class SuperClass {
    void method() {
        System.out.println("Superclass");
    }
}

class BaseClass extends SuperClass {
    @Override
    void method() throws ArithmeticException {

        System.out.println("Sub class");
    }

    public static void main(String args[]) {
        BaseClass s1 = new BaseClass();
        s1.method();
    }
}
