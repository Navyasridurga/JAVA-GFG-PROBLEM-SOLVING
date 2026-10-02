public class FoodOrder {
    int orderId;
    String foodName;
    int price;

    FoodOrder(int orderId, String foodName, int price) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.price = price;
    }

    void showOrderDetails() {
        System.out.println("order id:" + orderId);
        System.out.println("Food:" + foodName);
        System.out.println("Price:" + price);
    }

}

class ExpressOrder  extends FoodOrder{
    int deliveryTime;

    ExpressOrder(int orderId, String foodName, int price, int deliveryTime) {
        super(orderId, foodName, price);
        this.deliveryTime = deliveryTime;
    }
    public static void main(String args[]){
        ExpressOrder e1=new ExpressOrder(9,"biryani",300,20);
        System.out.println(e1.orderId);
        System.out.println(e1.foodName);
        System.out.println(e1.price);
       System.out.println(e1.deliveryTime);
       
       
    }

}
