class Employee {
    String name;
    int salary;

    void display(String name,int salary){
       
   
        try{
        
             if (name == null){
                System.out.println("name ledu mitrama");
             }
             else{
                    System.out.println("name received");
             }
            }
    catch(
    NullPointerException e)
    {
        System.out.println("Employee name is missing");
    }
    finally
    {
        System.out.println("Salary process completed");
    }
}


    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.display("navya", 1000);
    }
}




