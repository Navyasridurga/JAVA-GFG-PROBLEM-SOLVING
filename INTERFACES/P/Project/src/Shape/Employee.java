package Shape;

public interface Employee {
     void work();

}
class Developer implements Employee{
    public  void work(){
        System.out.println("develope doing work");
    }
}
class company{
    public static void main(String args[]){
        Developer d1 =new Developer();
        d1.work();
    }
}
