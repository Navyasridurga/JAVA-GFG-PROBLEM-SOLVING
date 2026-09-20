class Shopping_Challenge{
    int prodcut(int price,int quantity){
      int total_Price=price*quantity;
    
    
    return total_Price;
    }


    public static void main(String[] args) {
        Shopping_Challenge s1=new Shopping_Challenge();
       int result= s1.prodcut(500,3);
        System.out.println(result);

    }
    }


