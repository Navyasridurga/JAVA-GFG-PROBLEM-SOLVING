public interface NumberOperation {
    int calculate(int a,int b);
    
}
class Text{
    public static void main(String args[]){
        NumberOperation n1=(a,b)->(a-b);
        System.out.println(n1.calculate(90,87));
    }
}
