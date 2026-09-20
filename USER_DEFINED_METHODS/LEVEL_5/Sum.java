public class Sum {
    int sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Sum s1=new Sum();
        int result=s1.sum(90);
        System.out.println(result);
    }
    
}
