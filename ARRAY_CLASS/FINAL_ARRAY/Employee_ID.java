import java.util.Arrays;
public class Employee_ID{
    public static void main(String args[]){
        final int[] employeeIds={101,102,103,104};
        employeeIds[2]=999;
        System.out.println(Arrays.toString(employeeIds));

    }
}