class FoodOrder{
    String foodName;
    int quantity;
    int price;
    FoodOrder(String foodName,int quantity,int price){
        this.foodName=foodName;
        this.quantity=quantity;
        this.price=price;

    }
    public static void main(String args[]){
        FoodOrder fd=new FoodOrder("biryani",23,4500);
        System.out.println(fd.foodName);
        System.out.println(fd.quantity);
        System.out.println(fd.price);

    }
}