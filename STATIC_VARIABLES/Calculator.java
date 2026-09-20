public class Calculator {
    void calculate(int num){
          System.out.println("Num:"+num);
        int result=num*2;//local scope
        if(result>10){//parameter scope
           int bonus=5;//block scope
           System.out.println("Bonus:"+bonus);
            System.out.println("Result:"+result);
        
        }
    }
        
        public static void main(String args[]){
            Calculator c1=new Calculator();
          

            c1.calculate(10);
        }
        }
    
    

