import java.time.*;
public class Problem7{
    public static void main(String args[]){
        LocalDate date=LocalDate.of(2026,11,9);
        LocalDate year=date.withYear(2030);
        System.out.println(year);

        LocalDate month=date.withMonth(1);
        System.out.println(month);
        LocalDate day=date.withDayOfMonth(25);
        System.out.println(day);
    }
}