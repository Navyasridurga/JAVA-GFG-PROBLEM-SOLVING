class IntegerExample{
    public static void main(String args[]){
        int num=100000;
        if(num>=Byte.MIN_VALUE && num<=Byte.MAX_VALUE){
            System.out.println("Fits in byte: "+true);
        }
        else{
            System.out.println("Fits in bytes:"+false);

        }
        if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE){
            System.out.println("Fits in Short:"+true);
        }
        else{
            System.out.println("Fits in short: "+false);
        }
        if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE){
            System.out.println("Fits in Integer:"+true);
        }
        else{
            System.out.println("Fits in Integer:"+false);
        }
        if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE){
            System.out.println("Fits in Long:"+true);

        }
        else{
            System.out.println("Fits in long:"+false);
        }
    }
}