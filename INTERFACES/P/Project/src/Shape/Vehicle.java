package Shape;

public interface Vehicle {
    abstract void start();
    abstract void stop();

class Car implements  Vehicle{
     public void start(){
        System.out.println("vehicle is start");
    }
    public void stop(){
        System.out.println("vehicle is stop");
    }
}
 class Main1{
    public static void main(String args[]){
        Car c1=new Car();
        c1.start();
        c1.stop();

    }
}
}
