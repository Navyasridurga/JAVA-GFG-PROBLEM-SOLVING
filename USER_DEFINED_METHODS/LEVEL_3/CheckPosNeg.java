public class CheckPosNeg {
    String checkposneg(int num){
        if(num>0){
            return "positive";
        }
        else if(num<0){
            return "negative";
        }
        else {
            return "zero";
        }
    }
    public static void main(String[] args) {
        CheckPosNeg v1=new CheckPosNeg();
        String result=v1.checkposneg(0);
        System.out.println(result);
    }

    
}
