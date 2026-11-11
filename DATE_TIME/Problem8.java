import java.time.*;
public class Problem8{
    public static void main(String args[]){
        LocalDate date=LocalDate.of(2028,02,10);
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.withDayOfMonth(1));
        System.out.println(date.plusDays(20));
        System.out.println(date);
    }
}