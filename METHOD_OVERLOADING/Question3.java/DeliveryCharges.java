public class DeliveryCharges {
    double  distance;
    int weight;
    int base_charge = 20;
    int total;

    void calculateCharges(double distance) {
        if (distance <= 5) {
            System.out.println("40 rupees");

        } else {
            System.out.println("60 rupees");
        }
    }

    void calculateCharges(double distance, int weight) {
        System.out.println("base charge 40 rupees");
        if (weight > 5) {
            total = base_charge + 20;
        } else {
            System.out.println("no extra charges");
        }
    }

    void calculateCharges(double distance, int weight, boolean express) {
        base_charge = 40;
        if (weight > 5) {
            total = base_charge + 20;
        System.out.println(total);

            if(express = true){
            total += 50;
            System.out.println(total);
            }
        

        }
        }
        public static void main(String args[]){
            DeliveryCharges d1=new DeliveryCharges();
            System.out.println(d1.calculateCharges(12));
           System.out.println(d1.calculateCharge(12,3));
           System.out.println(d1.calculateCharge(13, 23,true));
       

        }
    }


