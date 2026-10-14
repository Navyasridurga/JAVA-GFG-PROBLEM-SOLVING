class Ticket{
    static void checkAge(int age) throws Exception{
        if(age<18){
            throw new Exception("Underage");
        }
        System.out.println("Ticket Booked");

    }
    public static void main(String args[]){
        try{
            checkAge(21);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("program ended");
        }
    }

} 