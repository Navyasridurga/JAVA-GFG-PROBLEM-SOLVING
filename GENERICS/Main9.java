import java.util.Scanner;
interface Salary<T>{
    public void Calculate(T basicSalary);

}
class MonthlySalary implements Salary<Double>{
    
   
    @Override
    public void  Calculate(Double basicSalary){
        double bonus=(basicSalary/100)*10;
        System.out.println("bouns:"+bonus);
         double actualSalry=basicSalary+bonus;
        System.out.println("actualSalary:"+actualSalry);
    }
}
class Main9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you salary");
        double salary=sc.nextDouble();

        MonthlySalary m1=new MonthlySalary();
        m1.Calculate(salary);

    }
}