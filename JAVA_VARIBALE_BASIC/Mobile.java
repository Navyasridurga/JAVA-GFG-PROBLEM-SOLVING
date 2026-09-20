class Mobile{
    String brand="Samsung";
    void display(){
        String model="A5";
        System.out.println(model);

    }
    public static void main(String args[]){
        Mobile m1=new Mobile();
        System.out.println(m1.brand);
        m1.display();


    }
}