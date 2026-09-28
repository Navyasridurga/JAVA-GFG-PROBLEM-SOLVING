class Laptop{
    String brand;
    int ram;
    int price;
    Laptop(String brand,int ram,int price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    public static void main(String args[]){
        Laptop l1=new Laptop("hp",9,8900);
        Laptop l2=new Laptop("dell",8,45000);
        System.out.println(l1.brand);
        System.out.println(l1.ram);
        System.out.println(l1.price);
        System.out.println(l2.brand);
        System.out.println(l2.ram);
        System.out.println(l2.price);
    }
}