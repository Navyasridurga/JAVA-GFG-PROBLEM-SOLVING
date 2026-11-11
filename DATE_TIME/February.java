import java.time.*;

public class February {
    public static void main(String args[]){
        LocalDate date=LocalDate.of(2028,02,10);
        System.out.println("Given Date: 2028-02-10");
        if(date.isLeapYear()){
            System.out.println("leap year: Yes");
int days=date.lengthOfMonth();

        
        for(int day=1;day<=days;day++){
            System.out.println(date.withDayOfMonth(day));
        }
    }
    
}
}