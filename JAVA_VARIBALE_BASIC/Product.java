class Product{
    int price=1000;
   void  calculate(){
       int discount=100;
       System.out.println(discount);
    }
    public static void main(String args[]){
        Product p1=new Product();
        System.out.println(p1.price);
        p1.calculate();
        
    }
}