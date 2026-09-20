public class LargestNumber {
    String largestNumber(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            return "num1 is big";
        }
        else if(num2>num1 && num2>num3){
            return "num2 is big";
        }
        else {
            return "num 3 is big";
        }
    }
    public static void main(String[] args) {
      LargestNumber l1=new LargestNumber();
     String result= l1.largestNumber(23, 230, 120);
     System.out.println(result);
    }
    
}
