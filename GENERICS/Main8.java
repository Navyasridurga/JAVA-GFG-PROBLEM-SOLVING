interface Tracker<T>
{
    public void track(T trackingId);
}
class CourierTracker implements Tracker<Long>{
    @Override
    public void track(Long trackingId){
        {
            System.out.println("Tracking Id:"+trackingId);

    }
}
}
class FoodTracker implements Tracker<String>{
    @Override
    public void track(String trackingId){
        System.out.println("Zomato order:"+trackingId);
    }
}
class Main8{
    public static void main(String args[]){
        FoodTracker f1=new FoodTracker();
        f1.track("Biryani");
        CourierTracker c1=new CourierTracker();
        c1.track(1238900000L);
        

    }
}