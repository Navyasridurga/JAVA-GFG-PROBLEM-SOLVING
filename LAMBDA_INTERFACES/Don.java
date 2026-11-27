interface SingleParameter{
abstract void  fun( int x);
}
public class Don{
    public static void main(String args[]){
        SingleParameter s1=(int x)->{
        System.out.println(x);
        if(x%2==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    };
    s1.fun(8);
    }
}