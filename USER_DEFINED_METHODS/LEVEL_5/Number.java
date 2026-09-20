public class Number {
    int number(int num){
        for(int i=num;i>=1;i--){
            return i;
        }
    }
    public static void main(String[] args) {
        Number n1=new Number();
       int result= n1.number(12);
       System.out.println(result);
    }
    
}
