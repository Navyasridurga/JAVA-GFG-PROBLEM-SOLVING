interface FunInterface{
    void  abstractFun(int x);
    default void normalFun(){
        System.out.println("Hello");
    }
}
public class Gfg{
    public static void main(String args[]){
        FunInterface fobj=(int x)->System.out.println(2*x);
        fobj.abstractFun(5);
            
        };
    }
