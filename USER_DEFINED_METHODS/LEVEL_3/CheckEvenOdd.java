public class CheckEvenOdd {
    String  checkEvenOdd(int num){
        if(num%2==0){
            return  "even";
        }
        else{
            return  "odd";
        }
            
    }
    public static void main(String[] args) {
        CheckEvenOdd c1=new CheckEvenOdd();
          System.out.println(c1.checkEvenOdd(56));
      
    }
    
}
