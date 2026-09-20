public class ThreeAverage {
    int average(int num1,int num2,int num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String args[]){
        ThreeAverage t1=new ThreeAverage();
        int result=t1.average(23,45,66);
        System.out.println(result);
    }
    
}
