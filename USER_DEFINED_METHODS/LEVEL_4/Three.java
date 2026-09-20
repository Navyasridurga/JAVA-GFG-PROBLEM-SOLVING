class Three{
    int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) {
        Three t1=new Three();
       int result= t1.sum(12,34,56);
       System.out.println(result);
    }
} 