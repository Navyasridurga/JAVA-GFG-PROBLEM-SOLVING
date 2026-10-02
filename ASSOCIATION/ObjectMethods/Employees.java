package ObjectMethods;

public class Employees {
    int id=101;
    @Override 
    public int hashCode(){
        return id*90;
    }
    public static void main(String args[]){
        Employees e1=new Employees();
        System.out.println(e1.hashCode());
    }


}
