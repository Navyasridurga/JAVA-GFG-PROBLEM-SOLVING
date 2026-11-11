import java.time.*;
public class Problem1{
    public static void main(String args[]){
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalDate birthday=LocalDate.of(2005,07,18);
        System.out.println(birthday);
       int  year=date.getYear();
        System.out.println(year);
        int month=date.getMonthValue();
        System.out.println(month);
        int day=date.getDayOfMonth();
        System.out.println(day);
    }
}