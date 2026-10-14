class Finalw{
    public static void main(String args[]){
        final int salary=250000;
        
        System.out.println(salary);
        try{
            int a=10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled");
        } finally{
            System.out.println("Program completed");
        }
    }
    
}