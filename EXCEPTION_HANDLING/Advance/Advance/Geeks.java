class InvalidAgeException  extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public  class Geeks{
    public static void validate(int age){
        if(age<18){
            throw new InvalidAgeException("aGE MUST BE 18 OR ABOVE");
        }
        System.out.println("valid age:"+age);
        
    }
    public static void main(String[] args) {
        try{
            validate(12);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}