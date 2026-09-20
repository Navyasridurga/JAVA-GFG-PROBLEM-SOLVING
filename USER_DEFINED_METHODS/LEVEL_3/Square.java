public class Square {
    double square(int num){
        return Math.sqrt(num);
    }
    public static void main(String[] args) {
        Square s1=new Square();
        System.out.println(s1.square(25));
    }
}
