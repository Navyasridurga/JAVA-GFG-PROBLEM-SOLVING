package Vehicle;

abstract class Vehicle1 {
    abstract  void start();

}
class  Car extends Vehicle1{
    
    void start(){
        System.out.println("car starts with key");
        
    }

}
class Main{
    public static void main(String args[]){
        Car c1=new Car();
        c1.start();
    }
}

