class  Shopping_Cart{
    public static void main(String args[]){
        String product=null;
        try{
            System.out.println(product.length());
        }
        catch(NullPointerException e){
            System.out.println("Product details are missing");
        }
        finally{
            System.out.println("Cart validation");
        }
    }
}