public class ByteOverFlow {
    public static void main(String args[]){
        byte b=127;
        b++;
        System.out.println(b);
        short s=32767;
            s++;
            System.out.println(s);
        int x=2147483648;
        x--;
        System.out.println(x);
    }
    
}
