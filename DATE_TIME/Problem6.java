import java.time.*;
import java.time.temporal.ChronoUnit;
public class Problem6{
    public static void main(String args[]){
        LocalDate date=LocalDate.of(2026,12,25);
        LocalDate date1=LocalDate.now();
        System.out.println(date.isEqual(date1));
        System.out.println(date.isAfter(date1));
        System.out.println(date.until(date1));
        System.out.println(ChronoUnit.DAYS.between(date,date1));
        LocalDate joiningDate=LocalDate.of(2024,06,10);
        System.out.println("Joining date:"+joiningDate);
        LocalDate year=joiningDate.plusYears(1);
        System.out.println(year);
        LocalDate month=joiningDate.plusMonths(6);
        System.out.println(month);


    }
}