package Shape;

public interface Problem1 {
    static int a=90;
   void  prob();
}
class Prob implements Problem1{
   public  void prob(){
        System.out.println("problem is every where");
    }
}
class Prob2{
    public static void main(String args[]){
        Prob p1=new Prob();
        p1.prob();
    }
}
