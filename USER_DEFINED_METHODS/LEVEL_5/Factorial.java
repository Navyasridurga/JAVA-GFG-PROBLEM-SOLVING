public class Factorial {
          int fact(int num)
          {
        if(num<=1){
            return num;
        }
        else{
            int sum=1;
            for(int i=1;i<=num;i++){
              sum=sum*i;
            }
            return sum;
        }
            
        }
        public static void main(String args[]){
            Factorial f1=new Factorial();
            int result=f1.fact(5);
            System.out.println(result);
        }
    }
    
    
    

