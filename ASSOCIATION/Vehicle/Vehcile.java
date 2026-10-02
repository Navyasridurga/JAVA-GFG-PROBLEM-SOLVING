package Vehicle;

public class Vehcile {
    void star(){
        System.out.println("Vehicle starts");
    }
}

 class Car extends Vehcile{
    
   @Override
    void star(){
        super.star();
        System.out.println("Car starts");
       

    }
    public static void main(String args[]){
        Car c1=new Car();
        c1.star();
       

    }

    }

