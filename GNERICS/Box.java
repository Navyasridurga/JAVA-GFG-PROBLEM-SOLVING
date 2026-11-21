class Box<T>{
    T value;
}
class Main{
public static void main(String[] args) {
    Box<Integer>b1=new Box<>();
    b1.value=100;
    Box<String>b2=new Box<>();
    b2.value="navya";
    System.out.println(b1.value);
    System.out.println(b2.value);
    
}
}