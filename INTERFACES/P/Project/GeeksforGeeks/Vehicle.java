// Consider vehicles such as bicycles and bikes. Both can change gears, increase speed, and apply brakes, 
// but each class can provide its own implementation.
public interface Vehicle {
    void changeGears(int a);

    void increaseSpeed(int a);

    boolean applyBrakes(boolean b);

}

class Bicycles implements Vehicle {
    int gear;
    int speed;
    boolean brakes;

    @Override
    public void changeGears(int newGear) {
        gear = newGear;
        System.out.println(" bicycle gear is :" + gear);
    }

    public void increaseSpeed(int increment) {
        speed = speed + increment;
        System.out.println("bicycle speed is:" + speed);
    }

    public void decreaseSpeed(int decrement){
        decrement=speed-decrement;
    }
    @Override
    public boolean applyBrakes(boolean c) {
        brakes = c;
        if(brakes){
            System.out.println(" bicycle brakes are in open");
        }
        else{
        System.out.println(" bicycle Brakes are in close");
        

    }
    return brakes;

}
}
class  bikes implements Vehicle {
    int gear;
    int speed;
    boolean state;
    public void changeGears(int gear1){
        gear=gear1;
        System.out.println("bike gear is:"+gear );
    }
    public void increaseSpeed(int speed1){
        speed=speed+speed1;
        System.out.println("bike speed:"+speed);
    }
    public void decreaseSpeed(int speed2){
        speed2=speed-speed2;
        System.out.println("bike speed decrease:"+speed2);
    }
    public boolean applyBrakes(boolean state1){
        state=state1;
        if(state){
            System.out.println("bike brakes are in open");
        }
        else{
            System.out.println("bike brakes are in close");
        }
        return state;
    }
    
    
}
class veh{
    public static void main(String args[]){
        Bicycles b1=new Bicycles();
        b1.changeGears(3);
        b1.increaseSpeed(40);
        b1.applyBrakes(true);
        b1.decreaseSpeed(23);
        bikes b2=new bikes();
        b2.changeGears(4);
        b2.increaseSpeed(34);
        b2.decreaseSpeed(23);
        b2.applyBrakes(false);

    }
}
