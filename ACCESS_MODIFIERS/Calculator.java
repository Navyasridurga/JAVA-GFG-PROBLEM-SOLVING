public class Calculator {
    private void calculate(){
        int a=100+200;
        System.out.println(a);
    }
    public  void display(){
        calculate();

    }
    public static void main(String args[]){
        Calculator c1=new Calculator();
        c1.display();
        
    }
    
}
