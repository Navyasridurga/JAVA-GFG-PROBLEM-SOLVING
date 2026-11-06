import java.util.Arrays;
public class EmployeePerformance<T,U,V extends Number> {
    private T employeeId;
    private U employeeName;
    private V[] performanceScores;
    public EmployeePerformance(T employeeId,U employeeName,
        V[] performanceScores){
            this.employeeId=employeeId;
            this.employeeName=employeeName;
            this.performanceScores=performanceScores;

        }
    public void setemployeeId(T employeeId){
        this.employeeId=employeeId;
    }
    public T getemployeeId(){
        return employeeId;
    }
    public void setemployeeName(U employeeName){
        this.employeeName=employeeName;
    }
    public U getemployeeName(){
        return employeeName;
    }
    public void setperformanceScores(V[] performanceScores){
        this.performanceScores=performanceScores;
    }
    public  V[] getperformanceScore(){
        return performanceScores;
    }
    public void displayDetails(){
        System.out.println("EmployeeId:"+employeeId);
        System.out.println("EmployeeName:"+employeeName);
        System.out.println("PerformanceScore:"+Arrays.toString(performanceScores));
        
    }
    public double calculateTotalScore(){
        double total=0;
        for(V score:performanceScores){
            total=total+score.doubleValue();
        }
        return total;
    }
    public double calculateAverage(){
    double total=calculateTotalScore();
        return total/performanceScores.length;
        }
    }

    class Main4{
        public static void main(String[] args) {
            EmployeePerformance<Integer,String,Integer> emp1=new EmployeePerformance<>(101, "Navya", new Integer[]{45,89,12});
            EmployeePerformance<String,String,Integer>emp2=new EmployeePerformance<>("EMP202","Durga",new Integer[]{70,80,90});
           emp1.displayDetails();
           System.out.println("Total score:"+ emp1.calculateAverage());
          System.out.println("Average score:"+ emp1.calculateTotalScore()); 
          emp2.displayDetails();
          System.out.println(emp2.calculateAverage());
          System.out.println(emp2.calculateTotalScore());

        }
    }
