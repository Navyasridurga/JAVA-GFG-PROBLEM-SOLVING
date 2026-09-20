public class GreatesNumber {
   String greatestNumber(int num1,int num2){
    if(num1<num2){
        return "num2 is big";
    }
    else{
        return "num1 is big";
    }

    }
    public static void main(String args[]){
        GreatesNumber g1=new GreatesNumber();
       String reslut= g1.greatestNumber(12,45);
       System.out.println(reslut);


    }
    
}
