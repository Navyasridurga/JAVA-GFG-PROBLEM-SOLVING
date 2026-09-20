class Employee{//class
   void showDetails(int salary){//method,parametr
    System.out.println("Salary:"+salary);
    int bonus=500;//local variable
    System.out.println("Bonus"+bonus);
    if(salary>20000){
        int tax=2000;//block level variable
        System.out.println("Tax:"+tax);
    }
}
    public static void main(String args[]){
        Employee e1=new Employee();//object
        e1.showDetails(10000);//method calling

    }


    }
