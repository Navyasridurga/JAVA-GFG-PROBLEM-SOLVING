class  Bound<T extends A>{
    private T objRef;
    public Bound(T obj){
        this.objRef=obj;
    }
    public void doRunTest(){
        this.objRef.display();
    }
}
public class A{
    public void display(){
        System.out.println("Inside super class A");
    }
}
class B extends A{
    public void display(){
        System.out.println("Inside super class B");
    }
}
class C extends A{
    public void display(){
        System.out.println("Inside super class C");
    }
}
class BoundClass{
    public static void main(String args[]){
        Bound<C> bec=new Bound<C>(new C());
        bec.doRunTest();
        Bound<B> beb=new Bound<B>(new B());
        bec.doRunTest();
        Bound<A> bea=new Bound<A>(new A());
        bec.doRunTest();
        
    }
}