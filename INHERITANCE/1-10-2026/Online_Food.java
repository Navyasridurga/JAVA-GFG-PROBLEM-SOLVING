class Online_Food{
    int orderId;
    String foodName;
    int price;
}
    class FoodOrder extends Online_Food{

        String deliveryAddress;
    
    public static void main(String args[]){
        FoodOrder fd=new FoodOrder();
        fd.orderId=101;
        fd.foodName="biryani";
        fd.price=100;
        fd.deliveryAddress="rcpuram";
        System.out.println(fd.orderId);
        System.out.println(fd.foodName);
        System.out.println(fd.price);
        System.out.println(fd.deliveryAddress);

    }

    }
