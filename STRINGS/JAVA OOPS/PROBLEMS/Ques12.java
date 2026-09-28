public class Ques12 {
    public static void main(String args[]){
        String transactionId="TXN20260928";
        int count=0;
        for(int i=0;i<transactionId.length();i++){
   if(Character.isDigit(transactionId.charAt(i))){
            count++;
   }
        
    }
    System.out.println(count);
    
}
}
