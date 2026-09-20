class Minimum{
    void minimum(int num1,int num2){
        if(num1<num2){
            System.out.println("num1 is small" );
        }
        else{
            System.out.println("num2 is small");
        }
    }
    public static void main(String[] args) {
        Minimum m1=new Minimum();
        m1.minimum(12,45);
    }
}