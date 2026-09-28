class Mobile1{
    String brand;
    int price;
    
    Mobile1(String brand,int price){
        this.brand=brand;
        this.price=price;

        
    }
    public static void main(String args[]){
        Mobile1 mb=new Mobile1("Samsung",23000);
        System.out.println("Brand: "+mb.brand);
        System.out.println("price:"+mb.price);
    


    }
}