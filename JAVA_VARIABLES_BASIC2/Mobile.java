package JAVA_VARIABLES_BASIC2;
class Mobile{
    String brand="Samsung";
    int price=25000;
    void display(){
        System.out.println("Brand:"+brand);
        System.out.println("Price:"+price);
    }
    public static void main(String args[]){
        Mobile m1=new Mobile();
        m1.display();
    }
}