public class Challenge2 {
     double db(String s){
        
        Double d=Double.parseDouble(s);
        double mul=d*2;
        return mul;

     }
     public static void main(String[] args) {
       Challenge2 c1=new Challenge2();
       double result=c1.db("45.5"); 
       System.out.println(result);
     }
}
