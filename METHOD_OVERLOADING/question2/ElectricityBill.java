package question2;

public class ElectricityBill {
    int units;
    int bill;
    
    int calculateBill(int units){
        bill=units*5;
       return bill;

    }
    int calculateBill(int units,int rate){
        bill=units*rate;
        return bill;
    }
    int calculateBill(int units,int rate,int discount){
        bill=(units*rate)-discount;
        return bill;
        
    }
    public static void main(String args[]){
    ElectricityBill e1=new ElectricityBill();
    int result=e1.calculateBill(500);
    int result1=e1.calculateBill(100,7);
    int result2=e1.calculateBill(100,7,50);
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);

    }
}
