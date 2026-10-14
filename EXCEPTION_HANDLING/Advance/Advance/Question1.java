
class Question1{
    public static void main(String args[]){
        int age=16;
        
            try {
                if(age<18){
                throw new Exception("Invalid age");
                }
                System.out.println("Eligible"); 
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        
        
    }
}