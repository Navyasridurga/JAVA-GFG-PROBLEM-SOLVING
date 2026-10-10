interface Operation{
    int square(int n);
}
public class Number{
    public static void main(String args[]){
        Operation o1= (n)->(n*n);
        System.out.println(o1.square(7));
    }
}