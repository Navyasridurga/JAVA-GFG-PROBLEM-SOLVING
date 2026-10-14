

class Pin{
    public static void main(String args[]){
        int pin=1234;
        int enteredPin=1111;
        try{
            System.out.println("Atm started");
            try{
            if(pin!=enteredPin){
                throw new Exception("not match");
            }
        }
        
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("Program ended");
            }
        
                
        
    
        }


}
}



        
    


        
    
