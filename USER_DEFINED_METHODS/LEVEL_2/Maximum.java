public class Maximum {
    void maximum(int num1,int num2){
        if(num1<num2){
            System.out.println("num 2 is big");
        }
        else{
            System.out.println("num1 is big");

        }


    }
    public static void main(String[] args) {
        Maximum m1=new Maximum();
        m1.maximum(23,45);
    }
    
}
