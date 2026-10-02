package abstract1;

public abstract class Food_Delivery {
    abstract void prepareFood();
}

 class OnlineOrder extends Food_Delivery{
    void prepareFood(){
        System.out.println("Food is being prepared for online delivery");
    }

}
class Main{
    public static void main(String args[]){
        OnlineOrder o1=new OnlineOrder();
        o1.prepareFood();
    }
}

