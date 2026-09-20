class ShortExample{
    public static void main(String args[]){
        int num=-32768;
        if(num>=Short.MIN_VALUE &&num<=Short.MAX_VALUE){
            System.out.println("valid Short");
        }
        else{
            System.out.println("not valid");
        }
        int num2=32767;
        if(num2>=Short.MIN_VALUE && num2<=Short.MAX_VALUE){
            System.out.println("valid short");
        }
        else{
            System.out.println("invalid short");
        }
    }
}