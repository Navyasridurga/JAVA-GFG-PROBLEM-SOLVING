import java.time.*;
public class Problem5{
    public static void main(String args[]){
        LocalDate date=LocalDate.of(2007,12,9);
        System.out.println(date.getMonth());
        LocalDate week=LocalDate.of(2026,07,15);
        System.out.println(week.getDayOfWeek());
        LocalDate date1=LocalDate.of(2008,8,23);
        System.out.println(date1.isLeapYear());
        LocalDate date2=LocalDate.of(2009,1,7);
        LocalDate date3=LocalDate.of(2008,8,9);
        System.out.println(date2.isBefore(date3));
        System.out.println(date2.isEqual(date3));
    }
}