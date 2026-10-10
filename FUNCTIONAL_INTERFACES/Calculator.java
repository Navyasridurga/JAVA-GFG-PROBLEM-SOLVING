interface Cal {
    int add(int a, int b);
}

public class Calculator {
    public static void main(String args[]) {
        Cal c = (a, b) -> (a + b);
       System.out.println(c.add(10, 20));

    };

}
