public class Cube {
    int cube(int num){
        return num*num*num;
    }
    public static void main(String[] args) {
        Cube s1=new Cube();
        int result=s1.cube(3);
        System.out.println(result);
    }
}
