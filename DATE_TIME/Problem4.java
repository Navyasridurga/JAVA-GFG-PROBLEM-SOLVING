import java.time.*;
public class Problem4{
    public static void main(String args[]){
        LocalDate create=LocalDate.of(2026,07,15);
        System.out.println(create);
        int year=create.getYear();
        System.out.println(year);
        LocalDate days=create.plusDays(30);
        System.out.println(days);
        LocalDate today=LocalDate.now();
        LocalDate date=today.minusDays(15);
        System.out.println(date);
        LocalDate birthDay=LocalDate.of(2005,07,18);
      LocalDate nextBirthday=birthDay.plusYears(2);
      System.out.println(nextBirthday);


    }
}