package company;

public interface Employee {
    public abstract  void work();
    public static final  String company_Name="TechCorp";
     default void login(){
        System.out.println("Employee login");
     }
}


