import java.io.IOException;
import java.io.FileNotFoundException;

class Vehicle {
    void start() throws IOException {
        System.out.println("this is vehicle");

    }
}

    class Car extends Vehicle {
        @Override
        void start() throws FileNotFoundException {
            

            System.out.println("this is car");

        }
    
    }
class Main{
    public static void main(String mav[]) {
        Car c1 = new Car();
        try{
            c1.start();
        }
        catch(IOException e){
            System.out.println("Execution handled");
        }
        finally{
            System.out.println("program execute");
        }

    }
}

