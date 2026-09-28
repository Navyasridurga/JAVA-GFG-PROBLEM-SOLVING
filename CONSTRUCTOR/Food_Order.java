class Food_Order{
    String item;
    int quantity;

public static void main(String args[]){
    
Food_Order fd=new Food_Order();
    fd.item="Biryani";
    fd.quantity=23;

System.out.println("item"+fd.item);
System.out.println(fd.quantity);
}
}