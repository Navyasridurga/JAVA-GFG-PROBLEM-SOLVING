public class Online_Shopping {
    String productName;

}

class ElectonicProduct extends Online_Shopping {
    String brand;

}
class Mobile extends ElectonicProduct {
    int ram;

    public static void main(String args[]) {
        Mobile m1 = new Mobile();
        m1.productName = "Phone";
        m1.brand = "Samsung";
        m1.ram = 8;
        System.out.println(m1.productName);
        System.out.println(m1.brand);
        System.out.println(m1.ram);
    }

}
