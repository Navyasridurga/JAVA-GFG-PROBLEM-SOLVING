abstract class Employee{
    abstract void calculateSalary();

    }

class developer extends Employee{

    void calculateSalary(){
        System.out.println("Developer salary calculated");
    }
    
    public static void main(String args[]){
        developer d1=new developer();
        d1.calculateSalary();
    }

    
}
