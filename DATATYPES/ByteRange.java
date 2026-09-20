public class ByteRange {
    public static void main(String args[]){
        int num=127;
        if(num>=Byte.MIN_VALUE &&num<=Byte.MAX_VALUE){
        System.out.println("Valid");
    }
    else{
        System.out.println("in valid");
        
    }
    int num2=-128;
    if(num2>=Byte.MIN_VALUE && num2<=Byte.MAX_VALUE){
        System.out.println("valid");
    }
    else{
        System.out.println("invalid");
    }
    
}
}
