class Divisible{
    int divisible(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%2==0){
                count++;

            }
            
        }
        return count;

    }
    public static void main(String[] args) {
        Divisible d1=new Divisible();
        int result=d1.divisible(2);
        System.out.println(result);
    }

}