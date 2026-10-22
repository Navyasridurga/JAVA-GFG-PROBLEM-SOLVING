class Super{
    void method()throws RuntimeException{
        System.out.println("Super class");
    }
    
}
class SubClass extends Super{
    void method() throws ArithmeticException{
        System.out.println("sub class");
    }
    public static void main(String args[]){
        Super  s1=new Super();
        s1.method();
    }
}