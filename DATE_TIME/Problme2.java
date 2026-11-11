import java.time.*;
public class Problme2{
    public static void main(String args[]){
    LocalDate birthday=LocalDate.of(2005, 7, 18);
      LocalDate newDate=birthday.plusDays(10);
      System.out.println(newDate);
      LocalDate minusDate=birthday.minusDays(10);
      System.out.println(minusDate);
      LocalDate year=birthday.plusYears(1);
      System.out.println(year);


    }

}