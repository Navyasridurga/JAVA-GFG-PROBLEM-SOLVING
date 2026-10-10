@FunctionalInterface 
interface Greet{
    void greet();
}
class Greeting{
    public static void main(String args[]){
        Greet g=()->{
            System.out.println("Hello,Welcome to java");
        };
        g.greet();
    }
}